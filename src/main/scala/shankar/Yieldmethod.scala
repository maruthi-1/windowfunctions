package shankar

object Yieldmethod extends App {
  //yield
//  val l=List(1,2,3,4,5,6,7)
//  for (i <- 1 to 5)
//  println(i)

 var a= 10
  val l=List(1,2,3,4,5,6,7)
 val  b=l.map(x=>a)
  println(b)




  println(for (i <- 1 to 5) yield i)
  println(for (e <- l) yield e)
  println(for (e <- l) yield e*2 )
  val fruits = Vector("apple", "banana", "lime", "orange")
  val ucFruits = for (e <- fruits) yield e.toUpperCase
  println(ucFruits)
println(for (i <- 0 until fruits.length) yield (i, fruits(i)))
  //map function

  val p=l.map(x=>x)
  println(p)
  val p2=l.map(x=>(x,1))
  println(p2)

}
