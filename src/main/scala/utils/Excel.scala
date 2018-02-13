package utils

import java.io.File

import jxl.Workbook
import jxl.write.{Label, WritableWorkbook}

class Excel {
  /**
    *
    * @param fileName  excel的文件名称
    * @param sheetName 将数据导入excel中的表名称
    * @param data      需要写入的数据
    * @return
    */
  def exportDataToExcel(fileName: String, sheetName: String, data: List[List[String]]): Unit = {
    val file = new File(fileName)
    var book: WritableWorkbook = null
    if (file.exists() && file.isFile) {//先查看文件是否存在，如果存在读取原文件，将读取的内容复制到新建的文件中，以达到修改文件的目的
      val wb = Workbook.getWorkbook(file)//获取源文件内容

      book = Workbook.createWorkbook(file, wb)//复制到新文件


    } else {//如果传入的文件名称在本地不存在，创建一个文件
      book = Workbook.createWorkbook(file)
    }
    var sheet = book.getSheet(sheetName)//根据传入的表名获取整个表的内容
    val label: Label = new Label(0, 0, "dsf")

    if (sheet == null) {//如果该表名在文件中不存在，就新创建一个表
       sheet = book.createSheet(sheetName, book.getNumberOfSheets)

    }

    /**
      * 读取数据
      */
    for (a <- data) {
      //每一行的数据
      val r: Int = sheet.getRows//获取表的总行数
      var c = 0 //写入每行数据时重置计数

      for (b <- a) {

        label.setString(b)
        sheet.addCell(label.copyTo(c, r))
        c += 1
      }


    }
    book.write()//写入文件
    book.close()//关闭文件
  }

}
