

object Main {

  def main(args: Array[String]): Unit = {
    println("Hello")

    val b = new MyObj.B(2,22)
    val q = MyObj.A()
    println(b)

  }
}


@schema
object MyObj {
  case class A()
}