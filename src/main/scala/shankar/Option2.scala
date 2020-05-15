package shankar

object Option2 extends  App {
  //var states = scala.collection.mutable.Map[Int, String]()
  var states = scala.collection.mutable.Map(1 -> "Alabama", 2 -> "Alaska")
  println(states.get(1)+"_"+states.get(1))
 println(states.get(1).get+"_"+states.get(1).get)
}
