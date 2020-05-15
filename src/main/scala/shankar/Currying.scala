package shankar

object Currying {

  // Define currying function
  def add(x: Int, y: Int) = x + y;
  def add2(a: Int) = (b: Int) => a + b;
  def add3(a: Int) = (b: Int) => a + b;

  def main(args: Array[String])
  {
    println(add(20, 19));
    println(add2(20)(19));
    val sum = add3(29)
    val sum1 = add3(29)
    println(sum)
    println(sum1)
    println(sum(5));

  }

}
