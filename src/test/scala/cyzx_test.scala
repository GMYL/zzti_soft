import action.dataType
import org.apache.spark.{SparkConf, SparkContext}
import pojo.Student



object cyzx_test {
  def main(args: Array[String]){

    val conf=new SparkConf()
    conf.setAppName("MN")
    conf.setMaster("local")

    val sc=new SparkContext(conf)
    val file=sc.textFile("src\\data\\list.txt")
//    file.collect.foreach(println)

    var datatype=new dataType()
    var s=new Student()

  val files=file.map(_.replaceAll("(\0|\\[|\\')","").replace("]","")).map{
    line=>
    val num = line.split(", ")
    (num(0).toLong % 100,(num(0),num(1)))
  }
    val library = files.filter(x => x._1 < 12)             //图书馆（25%）
    val cyzx = files.filter(x => x._1 >= 12 && x._1 < 17)  //创业中心（10%）
    val jf = files.filter(x => x._1 >= 17 && x._1 < 22)   //机房工作（10%）
    val go_out = files.filter(x => x._1 >= 22 && x._1 < 24)  //经常外出（5%）
    val pt_stu = files.filter(x => x._1 >= 24 && x._1 < 39)  //普通学生（25%）
    val qt = files.filter(x => x._1 >= 39 &&x._1 < 45)     //其他（15%）

    //创业中心人员  数据  转成集合 生成
    val cyzxsize=cyzx.count().toInt
    val nums =cyzx.map(qt=>qt._2._1).take(cyzxsize)
    val names=cyzx.map(qt=>qt._2._2).take(cyzxsize)
    for (i <-0 until cyzxsize){
      s.name=names(i)
      s.id=nums(i)
      datatype.cxzy(s)
    }

    //图书馆  数据  转成集合 生成
    val libraryzxsize=cyzx.count().toInt
    val librarynums =library.map(qt=>qt._2._1).take(libraryzxsize)
    val librarynames=library.map(qt=>qt._2._2).take(libraryzxsize)
    for (i <-0 until libraryzxsize){
      s.name=librarynames(i)
      s.id=librarynums(i)
      datatype.library(s)
    }

  }

}
