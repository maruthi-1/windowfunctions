package shankar

object Methodandfunction extends App {



  def add(x: Int, y: Int) = x + x
//val sum= add(2)
//  println(sum)

  val add1 = (x: Int, y: Int) => x + x
//  val sum2= add1(2)
//  println(sum2)



  val list = List((1,1),(2,2),(3,4))


  println(list.map(add1.tupled))

//  println(list.map(x => add _))



}
