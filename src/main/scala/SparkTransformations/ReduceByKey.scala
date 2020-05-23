package SparkTransformations

import org.apache.spark.sql.SparkSession

object ReduceByKey extends App {
  val spark: SparkSession = SparkSession.builder.master("local").appName("transformations")
    .getOrCreate
  val sc = spark.sparkContext
val data = sc.parallelize(Array(("C",3),("A",1),("B",4),("A",2),("B",5)))
  val reducefunc = data.reduceByKey((value, x) => (value + x))
  println(reducefunc.collect().mkString)



}
