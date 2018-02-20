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
    var datatype=new dataType()
    var s=new Student()
  val files=file.map(_.replaceAll("(\0|\\[|\\')","").replace("]","")).map{
    line=>
    val num = line.split(", ")
    (num(0).toLong % 100,(num(0),num(1)))
  }
    val library = files.filter(x => x._1 < 12)             //图书馆（25%）
    val cyzx = files.filter(x => x._1 >= 12 && x._1 < 17)  //创业中心（10%）
    val lab = files.filter(x => x._1 >= 17 && x._1 < 22)   //机房工作（10%）
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
      datatype.cyzx(s)
    }
    //图书馆  数据  转成集合 生成
    val libraryzxsize=library.count().toInt
    val librarynums =library.map(qt=>qt._2._1).take(libraryzxsize)
    val librarynames=library.map(qt=>qt._2._2).take(libraryzxsize)
    for (i <-0 until libraryzxsize){
      s.name=librarynames(i)
      s.id=librarynums(i)
      datatype.library(s)
    }
    //实验室  数据  转成  生成
    val labxsize=lab.count().toInt
    val labnums =lab.map(qt=>qt._2._1).take(labxsize)
    val labnames=lab.map(qt=>qt._2._2).take(labxsize)
    for (i <-0 until labxsize){
      s.name=labnames(i)
      s.id=labnums(i)
      datatype.lab(s)
    }
    //经常外出  数据  转成  生成
    val go_outsize=go_out.count().toInt
    val go_outums =go_out.map(qt=>qt._2._1).take(go_outsize)
    val go_outnames=go_out.map(qt=>qt._2._2).take(go_outsize)
    for (i <-0 until go_outsize){
      s.name=go_outnames(i)
      s.id=go_outums(i)
      datatype.jcwc(s)
    }
    //普通学生  数据  转成 生成
    val pt_stusize=pt_stu.count().toInt
    val pt_stuums =pt_stu.map(qt=>qt._2._1).take(pt_stusize)
    val pt_stunames=pt_stu.map(qt=>qt._2._2).take(pt_stusize)
    for (i <-0 until pt_stusize){
      s.name=pt_stunames(i)
      s.id=pt_stuums(i)
      datatype.commonStu(s)
    }
    //其他学生  数据  转成 生成
    val qtsize=qt.count().toInt
    val qtums =qt.map(qt=>qt._2._1).take(qtsize)
    val qtnames=qt.map(qt=>qt._2._2).take(qtsize)
    for (i <-0 until qtsize){
      s.name=qtnames(i)
      s.id=qtums(i)
      datatype.other(s)
    }
  }

}
