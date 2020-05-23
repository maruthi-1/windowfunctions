package shankar

object Evensum extends App {
  def totalnumbers(list: List[Int], selector: Int => Boolean) = {
    val sum = 0
    list.foreach { e => if (selector(e)) sum + e }
    sum
  }
  val number = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


  println(totalnumbers(number, { e => e%2==0}))

//  def totalnumbers(list: List[Int]) = {
//    val sum = 0
//    list.foreach { e => if (e%2==0) sum + e }
//    sum
//  }
//  val number = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//
//
//  println(totalnumbers(number))


  val a=1
  val b=2
  val c=a+b;

  println(c)
}
