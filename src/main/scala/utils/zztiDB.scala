package utils

import java.sql.Timestamp

import slick.driver.MySQLDriver.api._

object zztiDB {
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

}
