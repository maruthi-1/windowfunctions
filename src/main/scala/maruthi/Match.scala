package maruthi

object Match  extends App {
 val l1 = Abnormal("maruthi", 123, "vbit")
 val l2 = Abnormal("swathi", 124, "vbit")
 val l3 = Abnormal("jyothi", 125, "vbit")


 for (x <- List(l1, l2, l3)) {
  x match {
   case Abnormal("maruthi", 123, "vbit") => println("Hi, maru")
   case Abnormal("swathi", 124, "vbit") => println("Hi, swa")
   case Abnormal("jyothi", 125, "vbit") => println("Hi, jyo")

  }
 }
 val normalList =List(
  ( "maruthi",123,"vbit"),("swathi",124,"vbit"),("jyothi",125,"vbit"
  ))
// for (x <- normalList) {
//  x match {
//   case Normall("maruthi", 123, "vbit") => println("Hi, maru")
//   case Normal("swathi", 124, "vbit") => println("Hi, swa")
//   case Normal("jyothi", 125, "vbit") => println("Hi, jyo")
//
//  }
// }

}
