package shankar

object purefunctions  extends App {

  def add(a:Int,b:Int) = a + b
  def multiply(a:Int,b:Int) = a * b
 val sum1= add(5,8) + multiply(5,8)
  val sum2= multiply(5,8) + add(5,8)

}
