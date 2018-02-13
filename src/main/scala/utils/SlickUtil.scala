package utils

import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.time.LocalDate

import org.slf4j.LoggerFactory
import pojo.Student
import slick.driver.MySQLDriver.api._

import scala.concurrent.Await
import scala.concurrent.duration._


class SlickUtil extends App
{
  // init logger
  val logger = LoggerFactory.getLogger(getClass.getSimpleName)


  // table name: scala_model
  case class UserInfo(id: Long,noid:String, name: String, classroom:String,sj_time:Timestamp,xj_time:Timestamp,sc_time:String)

  class SlickModelTable(tag: Tag) extends Table[UserInfo](tag, "sjjl")
  {
    // define column attribute
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def noid=column[String]("noid")
    def name = column[String]("name")
    def classroom =column[String]("classroom")
    def sj_time = column[Timestamp]("sj_time")
    def xj_time =column[Timestamp]("xj_time")
    def sc_time =column[String]("sc_time")
    def * = (id,noid,name,classroom,sj_time,xj_time,sc_time) <> (UserInfo.tupled, UserInfo.unapply)
  }
  def slick_table = TableQuery[SlickModelTable]



  // config database
  val db = Database.forURL(
    url = "jdbc:mysql://localhost:3306/zzti_db?useUnicode=true&characterEncoding=UTF-8&useSSL=false",
    driver = "com.mysql.jdbc.Driver",
    user = "root",
    password = "root")

  // add
  def addUserInfo(student:Student): Unit ={
    var timestr=LocalDate.now()+" "+"18:15:38"
    val tsFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    def ts(str: String) = new Timestamp(tsFormat.parse(str).getTime)
    var time=ts(timestr)

    val user = UserInfo(6L, student.id,student.name, "2#201",time,time,"60")
    val newArray = Seq[UserInfo](user)
    val res3 = Await.result(db.run(slick_table ++= newArray), Duration.Inf) // return the insert numbers: 2, so no need to return
    logger.debug("slick add success")
  }


}