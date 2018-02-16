package utils

import java.io.FileWriter
import java.sql.{Date, Timestamp}
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.{Locale, TimeZone}
import java.lang.Long

import org.slf4j.LoggerFactory
import pojo.Student
import slick.driver.MySQLDriver.api._

import scala.concurrent.Await
import scala.concurrent.duration._

object Utils {
  /*随机获取时间当天时间的方法*/
  def getTime(int: Int):String={
    var loc=new Locale("en")
    var fm=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",loc)
    var t=""
    int match {
      case 0 =>t=((new util.Random).nextInt(15)+6)+":"+(new util.Random).nextInt(60)+":"+(new util.Random).nextInt(60)
      case 1  =>t="06:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 2  =>t="06:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 3  =>t="07:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 4  =>t="07:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 5  =>t="08:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 6  =>t="08:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 7  =>t="09:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 8  =>t="09:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 9  =>t="10:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 10 =>t="10:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 11 =>t="11:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 12 =>t="11:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 13 =>t="12:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 14 =>t="12:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 15 =>t="13:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 16 =>t="13:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 17 =>t="14:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 18 =>t="14:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 19 =>t="15:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 20 =>t="15:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 21 =>t="16:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 22 =>t="16:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 23 =>t="17:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 24 =>t="17:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 25 =>t="18:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 26 =>t="18:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 27 =>t="19:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 28 =>t="19:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 29 =>t="20:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 30 =>t="20:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 31 =>t="21:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case 32 =>t="21:"+(60-(new util.Random).nextInt(30))+":"+(new util.Random).nextInt(60)
      case 33 =>t="22:"+(new util.Random).nextInt(30)+":"+(new util.Random).nextInt(60)
      case _=>t=((new util.Random).nextInt(15)+6)+":"+(new util.Random).nextInt(60)+":"+(new util.Random).nextInt(60)
    }
    var timestr=LocalDate.now()+" "+t
    var time=fm.parse(timestr).getTime.toString
    time

  }
  /*时间戳转化成日期格式yyyy-MM-dd HH:mm:ss*/
  def transformat(date:String):String ={
    val myformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    myformat.setTimeZone(TimeZone.getTimeZone("GMT"+8))
    val time=new Date(new Long(date))
    myformat.format(time)
  }


  /*食堂刷卡*/
  def stsk(student: Student,int:Int): Unit ={

    var time=getTime(int)// 0和大于33的值为随机6-22点的时间，1-33分别对应6-22点半的33个时间段，每半个小时一个时间段
    var ckid=(new util.Random).nextInt(20)//随机窗口号，假定20个窗口
    var xfje=(new util.Random).nextInt(20)+( if((new util.Random).nextDouble()>0.5)0.50 else 0.00)//随机消费金额20以内，整数或.5小数
    var syje=(new util.Random).nextDouble().formatted("%.2f").toDouble+(new util.Random).nextInt(300)//随机剩余金额300以内的小数
    var stskjl="id:"+student.id+" name:"+student.name+" ck:"+ckid+" xfje:"+xfje+" syje:"+syje+" time:"+time+"\r\n"//拼接成一条记录,每个字段以空格分开
    val writer=new FileWriter("src\\data\\stsk.txt",true)
    writer.write(stskjl)
    writer.close()
    print(stskjl)

  }
  /*摄像记录*/
  def sxjl(student: Student,int: Int): Unit ={

    var time = getTime(int)
    var sbbh=(new util.Random).nextInt(128)
    var sxjls="id:"+student.id+" name:"+student.name+" sbbh:"+sbbh+" time:"+time+"\r\n"
    val writer=new FileWriter("src\\data\\sxjl.txt",true)
    writer.write(sxjls)
    writer.close()
    print(sxjls)

  }
  /*门禁记录*/
  def mjjl(student: Student,int: Int): Unit ={

    var time=getTime(int)
    var mjjls="id:"+student.id+" name:"+student.name+" time:"+time+"\r\n"
    val writer=new FileWriter("src\\data\\mjjl.txt",true)
    writer.write(mjjls)
    writer.close()
    print(mjjls)
  }
  /*联网记录*/
  def WIFIjl(student: Student,int: Int):Unit ={
    var sxsj = getTime(int).toLong  //上线时间
    var lybh=(new util.Random).nextInt(8) //路由编号
    var zxsc=(new util.Random).nextInt(180)+10 //在线时长 10-180分钟
    var xxsj=sxsj+zxsc*60000  //下线时间
    var WIFIjls="id:"+student.id+" name:"+student.name+" lybh:"+lybh+" sxsj:"+sxsj+" xxsj:"+xxsj+" zxsc:"+zxsc+"\r\n"
    val writer=new FileWriter("src\\data\\WIFIjl.txt",true)
    writer.write(WIFIjls)
    writer.close()
    print(WIFIjls)
//    print(WIFIjls)

  }
  /*查课记录*/
  def ckjl(student: Student,int: Int,state:Boolean): Unit ={
    //上课教室
    var list=List("1#101","1#102","1#103","1#104","1#105","1#106","1#201","1#202","1#203","1#204","1#205",
      "1#206","1#207","1#208","1#301","1#302","1#303","1#304","1#305","1#306","1#307","1#401","1#402",
      "1#403","1#404","1#405")
    var listlength=(new util.Random).nextInt(list.length+1) //
    var classrooms=list(listlength)
    var cksj=transformat(getTime(int))
    var a=new Excel()
    var isjs=""
    if (state){
      isjs="是"

    }else{
      isjs="否"
    }

    var sd:List[List[String]]=List(List(student.id,student.name,classrooms,isjs,cksj))//写入一条记录
    a.exportDataToExcel("src\\data\\ckjl.xls","sheet1",sd)
  }


  /*查寝记录*/
  def cqjl(student: Student,int: Int,state:Boolean): Unit ={
    //寝室号
    var list=List("3#101","3#102","3#103","3#104","3#105","3#106","3#201","3#202","3#203","3#204","3#205",
      "3#206","3#207","3#208","3#301","3#302","3#303","3#304","3#305","3#306","3#307","3#401","3#402",
      "3#403","3#404","3#405")
    var listlength=(new util.Random).nextInt(list.length+1) //
    var qinshiID=list(listlength)//随机得到一个寝室号
    var cqsj=transformat(getTime(int))
    var a=new Excel()
    var isqs=""
    if (state){
      isqs="是"

    }else{
      isqs="否"
    }
    var sd:List[List[String]]=List(List(student.id,student.name,qinshiID,isqs,cqsj))//写入一条记录
    a.exportDataToExcel("src\\data\\cqjl.xls","sheet1",sd)
  }

  //上机记录    数据库
  import zztiDB._
  def sjjl(student: Student,int: Int): Unit ={
    // init logger
    val logger = LoggerFactory.getLogger(getClass.getSimpleName)
    logger.debug("slick add start")
    // config database
    val db = Database.forURL(
      url = "jdbc:mysql://localhost:3306/zzti_db?useUnicode=true&characterEncoding=UTF-8&useSSL=false",
      driver = "com.mysql.jdbc.Driver",
      user = "root",
      password = "root")

    // add
    var si=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    def ts(str: String) = new Timestamp(si.parse(str).getTime)

    //上机地点
    var list=List("2#101","2#102","2#103","2#104","2#105","2#106","2#201","2#202","2#203","2#204","2#205",
      "2#206","2#207","2#208","2#301","2#302","2#303","2#304","2#305","2#306","2#307","2#401","2#402",
      "2#403","2#404","2#405")
    var listlength=(new util.Random).nextInt(list.length+1) //
    var classrooms=list(listlength)

    //上线时间
    var sxsj = getTime(int).toLong  //上线时间
    var da_sxsj=ts(si.format(new Date(sxsj)))

    //在线时长 10-100分 当为80-100时候 为一个课时90分钟 其他时间为自由上机
    var zxsc=0
    var ra=(new util.Random).nextInt(100)+10
    if (79<ra&&ra<101){
      zxsc=90
    }else{
      zxsc=ra
    }

    //下线时间
    var xxsj=sxsj+zxsc*60000  //下线时间
    var  lt=xxsj //1517914988000
    var da = new Date(lt)  //Tue Feb 06 19:03:08 GMT+08:00 2018
    var res=si.format(da)  //2018-02-06 19:03:08
    var da_xxsjs=ts(res)

    val user1 = UserInfo(2, student.id,student.name,classrooms,da_sxsj,da_xxsjs,zxsc.toString)
    val newArray = Seq[UserInfo](user1)
    val res3 = Await.result(db.run(slick_table ++= newArray), Duration.Inf) // return the insert numbers: 2, so no need to return

    logger.debug("slick add end")
  }

  def main(args: Array[String]): Unit = {
    var s=new Student()
    s.id="201560240238"
    s.name="梁朝阳"
    mjjl(s,3)//7:00-7:30
    stsk(s,4)//7:30-8:00
    sxjl(s,5)//8:00-8:30
    WIFIjl(s,6)//8:30-9:00
    WIFIjl(s,7)//9:00-9:30
    WIFIjl(s,8)//9:30-10:00
    WIFIjl(s,9)//10:00-10:30
    sxjl(s,10)
    WIFIjl(s,11)
    sxjl(s,12)//11:30-12:00
    stsk(s,13)//12:00-12:30
    mjjl(s,14)//12:30-13:00
    WIFIjl(s,15)
    mjjl(s,16)//13:30-14:00
    sxjl(s,17)//14:30-15:00 上机
    sjjl(s,19)//15:00-15:30
    sjjl(s,20)//15:30-16:00
    sxjl(s,21)//16:00-16:30上课
    WIFIjl(s,22)//16:30-17:00
    WIFIjl(s,23)//17:00-17:30
    WIFIjl(s,24)//17:30-18:00
    sxjl(s,25)//18：00-18：30
    stsk(s,26)//18:30-19:00
    sxjl(s,27)//19:00-19:30
    WIFIjl(s,28)//19:30-20:00
    WIFIjl(s,29)//20:00-20:30
    sxjl(s,30)//20:30-21:00
    WIFIjl(s,31)//21:00-21:30
    sxjl(s,32)//21:30-22:00
    mjjl(s,33)//22:00-22:30
    var bool=true
    cqjl(s,0,bool)
    ckjl(s,0,bool)
  }

}
