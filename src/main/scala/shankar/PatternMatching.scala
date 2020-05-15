package shankar

object PatternMatching extends App {


  def myfunct(n: Int) =
    n match {
    case even if n % 2 == 0 => "even"
    case odd => "odd"
  }

}
