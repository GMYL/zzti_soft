import utils.Excel

object excel_test {
  def main(args: Array[String]): Unit = {
    var a=new Excel()
//    var sd:List[List[String]]=List()//创建空列表
//    sd=sd:+List.fill(5)("hhhh")//一行数据
//    sd=sd:+List.fill(5)("gjhjghj")
//        List.tabulate(6)(n=>n*n)
//    sd::List.tabulate(7)(n=>n*n)
    var sd:List[List[String]]=List(List("we","we1","we2"))
    a.exportDataToExcel("test.xls", "sheet1", sd)
  }

}
