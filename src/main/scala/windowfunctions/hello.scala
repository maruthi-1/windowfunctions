package windowfunctions

object hello {
  def main(args: Array[String]): Unit = {
    //map function
    val points = List(1, 2, 3, 4, 5)
    //    val s1= points.map(x=>1 to x map(y=>y))
    //    println(s1)
    //    val s3= points.map(y=>(y,1))
    //    println(s3)
    //    val result = points.map(x => x*3)
    //    println(result)
    //
    //    //flatmap
    //    val s2= points.flatMap(x=>1 to x map(y=>y))
    //    println(s2)
    //    val name = Seq("Nidhi", "Singh")
    //    val f1=name.flatMap(_.toUpperCase())
    //    println(f1)
    //
    //    //slice
    //    val slice1 = points.slice(1, 3)
    //    println(slice1)
    //
        //flatten
    //    val flatten=name.flatten
      //  println(flatten)
        val lol = List(List(1,2,3,4,5), List(3,4))
        val r=lol.flatten
        println("flatten"+r)

    //fold
    val r1 = points.fold(0)((x, y) => x + y)
    println("fold" + r1)

    //scan
    val x1 = points.scan(0)((x, y) => x + y)
    val xs = points.scan(0)(_ + _)
    println("scan" + x1)
    println("scan" + xs)

    //reduce
    val res = points.reduce((x, y) => x + y)
    println("reduce" + res)


        //foldleft
        val x2=points.foldLeft(0)(_+_)
        println("foldleft"+x2)
    //
    //    //foldright
    //    val x3=points.foldRight(0)(_+_)
    //    println("foldright"+x3)
    //
    //
    ////groupby
    //    val s = Seq(((1, 2), 3), ((1, 5), 6), ((2, 4), 32))
    //    val rs1=s.groupBy(x=>x._1)
    //    val rs2=s.groupBy(x=>x._2)
    //    println("iam 1st group by"+rs1)
    //    println("iam 1st group by"+rs2)
    //
    //    val l=List(("hi",1),("hi",2))
    //    val g=l.groupBy(x=>"hi")
    //
    //    val l1=List(1,2,3,4,5,6,7,5,4,3,2,1)
    //    println(l1)
    //    val m=l1.groupBy(x=>x)
    //    m.foreach { println }
    //  }


  }
}
