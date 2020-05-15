package shankar

object Mapfunctions extends App {
  val l= List(1,2,3,4,5)

  //map function
  val s1= l.map(x=>1 to x map(y=>y))
  println(s1)
  val s2=l
    .map(y=>(y,1))
  println(s2)

val s3=l.map( x => x * 2 )
  println(s3)
  //foreach
}
