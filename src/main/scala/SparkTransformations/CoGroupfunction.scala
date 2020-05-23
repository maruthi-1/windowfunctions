package SparkTransformations

import org.apache.spark.sql.SparkSession

object CoGroupfunction extends App {
  val spark: SparkSession = SparkSession.builder.master("local").appName("transformations")
    .getOrCreate
  val sc = spark.sparkContext
//  val data1 = sc.parallelize(Seq(("A",1),("B",2),("C",3)))
//  val data2 = sc.parallelize(Seq(("C",3),("B",4),("E",5)))
//  val cogroupfunc = data1.cogroup(data2)
//  val joinfunc = data1.join(data2)
//
//  println(cogroupfunc.collect().mkString)
//  println(joinfunc.collect().mkString)


    val rdd1 = sc.makeRDD(Array(("A","1"),("B","2"),("C","3")),2)
  val rdd2 = sc.makeRDD(Array(("A","a"),("C","c"),("D","d")),2)

  val join = rdd1.join(rdd2).collect
  println(join.mkString)
  val cogroup = rdd1.cogroup(rdd2).collect
  println(cogroup.mkString)

}
