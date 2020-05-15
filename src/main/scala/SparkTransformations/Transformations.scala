package SparkTransformations

import org.apache.spark.sql.SparkSession


object Transformations {
  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession.builder.master("local").appName("transformations")
      .getOrCreate
    val sc = spark.sparkContext


        //map
            val x = sc.parallelize(Array("b", "a", "c"))
          val y = x.map(z => (z, 1))
        println(x.collect().mkString(", "))
          println(y.collect().mkString(", "))

        //filter
    val a = sc.parallelize(Array(1,2,3))
        val b = a.filter(n => n%2 == 1)
        println(a.collect().mkString(", "))
        println(b.collect().mkString(", "))

       //       flatmap
        val c = sc.parallelize(Array(1,2,3))
        val d = c.flatMap(n => Array(n, n*100, 42))
        println(c.collect().mkString(", "))
        println(d.collect().mkString(", "))

        //groupby
        val e = sc.parallelize(
          Array("John", "Fred", "Anna", "James"))
        val f = e.groupBy(w => w.charAt(0))
        val g = e.groupBy(w => w)
        println(f.collect().mkString(", "))
        println(g.collect().mkString(", "))

        //groupby key

        val h = sc.parallelize(
          Array(('B',5),('B',4),('A',3),('A',2),('A',1)))
        val i = h.groupByKey()
        println(h.collect().mkString(", "))
        println(i.collect().mkString(", "))
         val rdd31 = sc.parallelize(List("Hello Hello Spark Apache Hello Dataneb Dataneb Dataneb Spark"))
        val keyValue = rdd31.flatMap(words => words.split(" ")).map(x=>(x,1))
      val groupbykeyresult = keyValue.groupByKey().map(t => (t._1, t._2.sum)).collect()
        println(groupbykeyresult.mkString)


    //aggrigate by key

        val  rdd124 = sc.parallelize(List("Hello Hello Spark Apache Hello Dataneb Dataneb Dataneb Spark"))
              .flatMap(words => words.split(" "))
              .map(x=>(x,1))
          .aggregateByKey(0)((x, y)=> x+y, (k, v)=> k+v )
          .collect
        println(rdd124.mkString)

    //sortByKey()

        val  rdd125 = sc.parallelize(List("Hello Hello Spark Apache Hello Dataneb Dataneb Dataneb Spark"))
          .flatMap(words => words.split(" "))
            .distinct
          .map(x => (x,1))
          .sortByKey()
          .collect
        println(rdd125.mkString)

        //REDUCEBYKEY VS GROUPBYKEY

      val  rdd123 = sc.parallelize(List("Hello Hello Spark Apache Hello Dataneb Dataneb Dataneb Spark"))

          .flatMap(words => words.split(" "))

          .map(x=>(x,1))

          .reduceByKey((x, y)=>x+y)

          .collect
        println(rdd123.mkString)


        val words = Array("one", "two", "two", "three", "three", "three")
        val wordPairsRDD = sc.parallelize(words).map(word => (word, 1))
        val wordCountsWithReduce = wordPairsRDD
          .reduceByKey(_ + _)
          println(wordCountsWithReduce.collect().mkString(", "))
        val wordCountsWithGroup = wordPairsRDD
          .groupByKey()
          .map(t => (t._1, t._2.sum))
        println(wordCountsWithGroup.collect().mkString(", "))


    //MAPPARTITIONS

        val x12 = sc.parallelize(1 to 9, 3).mapPartitions(x=>(Array("Hello").iterator)).collect
        println(x12.mkString)
      val x121 =  sc.parallelize(1 to 10, 2).mapPartitions(x=>(List(x.next,x.next, "|").iterator)).collect
        println(x121.mkString)
        val x122=sc.parallelize(1 to 9, 2).mapPartitions(x=>(List(x.next, x.hasNext).iterator)).collect
        println(x122.mkString)
        val x123 = sc.parallelize(1 to 10, 2).mapPartitions(x=>(List(x.next, x.next, x.next, x.hasNext).iterator)).collect
        println(x123.mkString)

           //mappartitionwithindex

        val mp = sc.parallelize(List("One","Two","Three","Four","Five","Six","Seven","Eight","Nine"), 3)
        val mpresult = mp.mapPartitionsWithIndex((index, iterator) => {iterator.toList.map(x => x + "=>" + index ).iterator} ).collect
        println(mpresult.mkString)

                       //sample
      val sp = sc.parallelize(1 to 10).sample(true, .4).collect
        println(sp.mkString)
     val sp2 =  sc.parallelize(1 to 10).sample(true, .2).collect
        println(sp2.mkString)
        val sp3 =  sc.parallelize(1 to 10).sample(true, 1).collect
        println(sp3.mkString)

                 //union(otherDataset)
                 val rdd1 = sc.parallelize(List("apple","orange","grapes","mango","orange"))
              val rdd2 = sc.parallelize(List("red","green","yellow"))
                    val rdd1result1=rdd1.union(rdd2).collect
                    println(rdd1result1.mkString)
                     val rdd1result2=rdd1.union(rdd2).collect
                    println(rdd1result2.mkString)

        val x4 = sc.parallelize(Array(1,2,3), 2)
        val y4 = sc.parallelize(Array(3,4), 1)
     val z4 = x4.union(y4)
       val  zOut = z4.collect()
        println(zOut.mkString)

    //  intersection(otherDataset)

        val rdd21 = sc.parallelize(-5 to 5)
        val rdd22 = sc.parallelize(1 to 10)
       val intersection = rdd21.intersection(rdd22).collect
        println(intersection.mkString)

        // distinct()
        val rdd23 = sc.parallelize(List("apple","orange","grapes","mango","orange"))
        val distinct=rdd23.distinct().collect()
        println(distinct.mkString)

    //join
    val rdd111 = sc.parallelize(List("Apple", "Orange", "Banana", "Grapes", "Strawberry", "Papaya")).map(words => (words, 1))
    val rdd222 = sc.parallelize(List("Apple", "Grapes", "Peach", "Fruits")).map(words => (words, 1))
    val innerjoin = rdd111.join(rdd222).collect
    println(innerjoin.mkString)
        val rightjoin =   rdd111.rightOuterJoin(rdd222).collect
        println(rightjoin.mkString)
        val leftjoin =   rdd111.leftOuterJoin(rdd222).collect
        println(leftjoin.mkString)
        val fulljoin =   rdd111.fullOuterJoin(rdd222).collect
        println(fulljoin.mkString)


        //cartesian()
        val rdd133 = sc.parallelize(List("Apple","Orange", "Banana", "Grapes", "Strawberry", "Papaya"))
         val rdd134 = sc.parallelize(List("Apple", "Grapes", "Peach", "Fruits"))
        val cartesian=rdd133.cartesian(rdd134).collect
        println(cartesian.mkString)


    //coalesce()
    val distData = sc.parallelize(1 to 16, 4)
    val size = distData.partitions.size

       val partition0 = distData.mapPartitionsWithIndex((index, iter) => if (index == 0) iter else Iterator()).collect
        println(partition0.mkString)
        val partition1 = distData.mapPartitionsWithIndex((index, iter) => if (index == 1) iter else Iterator()).collect
        println(partition1.mkString)
        val partition2 = distData.mapPartitionsWithIndex((index, iter) => if (index == 2) iter else Iterator()).collect
        println(partition2.mkString)
        val partition3 = distData.mapPartitionsWithIndex((index, iter) => if (index == 3) iter else Iterator()).collect
        println(partition3.mkString)
    val coalData = distData.coalesce(2).collect()
    println(coalData.mkString)

    //repartition()
    val repartData = distData.repartition(2)
    val repartition = repartData.mapPartitionsWithIndex((index, iter) => if (index == 0) iter else Iterator()).collect
    println(repartition.mkString)

  }
}
