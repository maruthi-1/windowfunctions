object Sideeffect extends App {
  def add(a:Int,b:Int) = a + b
  def multiply(a:Int,b:Int) = a * b
  val s1=add(5,8) + multiply(5,8)
  val s2=multiply(5,8) + add(5,8)
  println(s1)
  println(s2)
  def pureFunction(name : String) = s"My name is $name"
  

  def impureFunction(name : String) = println(s"My name is $name")
}
