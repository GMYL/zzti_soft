import org.apache.spark.{SparkConf, SparkContext}
import scala.collection.mutable.ArrayBuffer
import org.apache.hadoop.hbase.HBaseConfiguration  
import org.apache.hadoop.hbase.mapreduce.TableOutputFormat
import org.apache.hadoop.mapreduce.Job  
import org.apache.hadoop.hbase.io.ImmutableBytesWritable  
import org.apache.hadoop.hbase.client.Result  
import org.apache.hadoop.hbase.client.Put  
import org.apache.hadoop.hbase.util.Bytes  

object mjjlSave {
  def main(args: Array[String]): Unit = {
    val conf =new SparkConf()
    conf.setAppName("shuffle expense")
    val sc=new SparkContext(conf)
    val tablename="zzti_data"
    sc.hadoopConfiguration.set(TableOutputFormat.OUTPUT_TABLE, tablename)  
    val job = new Job(sc.hadoopConfiguration)  
    job.setOutputKeyClass(classOf[ImmutableBytesWritable])  
    job.setOutputValueClass(classOf[Result])    
    job.setOutputFormatClass(classOf[TableOutputFormat[ImmutableBytesWritable]])    
    
    val file=sc.textFile("/zzti/data/mjjl.txt")
    val t_s_rdd= file.map { x =>
      val fields = x.split(" ")
      (fields(2).toString, (fields(0).toString, fields(1).toString))
    }.filter { x => x._1 != 0
    }.groupByKey().flatMap{x=>
      val time=x._1
      val s_list=x._2
      val s_arr=s_list.toArray
      val t_s_arr=ArrayBuffer[(String,(String,String))]()
      for (i <- 0 until s_arr.length){
        t_s_arr +=((time,(s_arr(i)._1,s_arr(i)._2)))
      }
      t_s_arr
    }.map{x=>
	val put =new Put(Bytes.toBytes(x._1))
	put.add(Bytes.toBytes("info"),Bytes.toBytes("sno"),Bytes.toBytes(x._2._1))
	put.add(Bytes.toBytes("info"),Bytes.toBytes("name"),Bytes.toBytes(x._2._2))
	(new ImmutableBytesWritable, put)  
}
	t_s_rdd.saveAsNewAPIHadoopDataset(job.getConfiguration())
    sc.stop()
  }
}
