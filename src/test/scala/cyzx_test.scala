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
    val library = files.filter(x => x._1 < 5)             //图书馆（10%）
    val cyzx = files.filter(x => x._1 >= 5 && x._1 < 10)  //创业中心（10%）
    val jf = files.filter(x => x._1 >= 10 && x._1 < 14)   //机房工作（5%）
    val zxs = files.filter(x => x._1 >= 14 && x._1 < 20)  //自习室（15%）
    val go_out = files.filter(x => x._1 >= 20 && x._1 < 23)  //经常外出（5%）
    val hostel= files.filter(x => x._1 >= 23 && x._1 < 29)  //宅在寝室（15%）
    val pt_stu = files.filter(x => x._1 >= 29 && x._1 < 39)  //普通学生（25%
    val qt = files.filter(x => x._1 >= 39 &&x._1 < 45)     //其他（15%）

    //创业中心人员  数据  转成集合 生成
    val qtsize=cyzx.count().toInt
    val nums =cyzx.map(qt=>qt._2._1).take(qtsize)
    val names=cyzx.map(qt=>qt._2._2).take(qtsize)
    for (i <-0 until qtsize){
      s.name=names(i)
      s.id=nums(i)
      datatype.cxzy(s)
    }

  }

}
