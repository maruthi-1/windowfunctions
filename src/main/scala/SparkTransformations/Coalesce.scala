package SparkTransformations

import org.apache.spark.sql.SparkSession

object Coalesce  extends App {
  val spark: SparkSession = SparkSession.builder.master("local").appName("transformations")
    .getOrCreate
  val sc = spark.sparkContext

  val data1 = sc.parallelize(Seq(("A",1),("B",2),("C",3),("D",4)),4)
    val data2 = sc.parallelize(Seq(("C",3),("B",4),("E",5)))
    val coalesce = data1.coalesce(2)


    println(coalesce.collect().mkString)

}
