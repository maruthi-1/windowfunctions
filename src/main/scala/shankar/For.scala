package shankar

object For extends App {
val l=List(1,2,3,4,5,6,7,8,9,10)

  for( a <- l){
    print( "Value of ..a: " + a*2);
  }
 for( a <- 1 to 10){
    println( "Value of a: " + a);
  }
  val m= l.map( x => x * 2 )

  val  a=List(1,"hi",4,"hu")



  println(a)


  println(m)
}
