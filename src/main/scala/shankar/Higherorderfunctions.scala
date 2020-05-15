package shankar

object Higherorderfunctions  extends App {
  val salaries = Seq(20000, 70000, 40000)
  val doubleSalary = (x: Int) => x * 2
  val newSalaries = salaries.map(doubleSalary)
  println(newSalaries)
  val newSalaries2 = salaries.map(x => x * 2)
  println(newSalaries2)

  val newSalaries3 = salaries.map(_ * 2)
  println(newSalaries3)

}
