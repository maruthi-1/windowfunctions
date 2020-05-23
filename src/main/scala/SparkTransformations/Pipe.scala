package SparkTransformations

import org.apache.spark.sql.SparkSession

object Pipe extends App {
  val spark: SparkSession = SparkSession.builder.master("local").appName("transformations")
    .getOrCreate
  val sc = spark.sparkContext

  val data = sc.parallelize(List(10,20,30,40,50))
  val takeresult=data.pipe("h")
  println(takeresult.collect().mkString)



}
