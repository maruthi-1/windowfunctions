package windowfunctions

object Bye {
  def main(args: Array[String]): Unit = {
    val l=List(1,2,3,4,5,4,3,2,1)
    val map=l.map(x=>x*3)

    println("map"+map)


 val l2= List(List(1,2), List(3,4))
    val flatten =l2.flatten
    println("flatten"+flatten)
    val  s = l.groupBy(x=>x)
    val s2=List("maruthi","harish","maruthi")
    println(s2.groupBy(x=>x))
    println("groupby"+s)
      val s4=l2.flatMap(x=>x)
    println("flatmap"+s4)
  //  s.map(x => ((x._1), (x._2) .size) ).foreach(println)


  }

}
