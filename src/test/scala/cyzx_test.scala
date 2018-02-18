import action.dataType
import pojo.Student

object cyzx_test {
  def main(args: Array[String]): Unit = {
    var datatype=new dataType()
    var s=new Student()
    s.name="梁朝阳"
    s.id="201560240238"
    datatype.cxzy(s)
    var s1=new Student()
    s1.name="郭明远"
    s1.id="201560240138"
    datatype.cxzy(s1)
  }

}
