package shankar

import org.apache.spark.sql.SparkSession

object ReducevsFold extends App {
  val spark: SparkSession = SparkSession.builder.master("local").appName("transformations")
    .getOrCreate
  val sc = spark.sparkContext

  val rdd1 = sc.parallelize(List(2,3,4),4)
  val foldresult = rdd1.fold(1)(_+_)
  val reduceresult= rdd1.reduce(_+_)

  println("fold"+foldresult)
  println("reduce"+reduceresult)

}
