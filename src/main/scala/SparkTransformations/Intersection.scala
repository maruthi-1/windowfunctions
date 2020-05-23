package SparkTransformations

import org.apache.spark.sql.SparkSession

object Intersection {
  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession.builder.master("local").appName("transformations")
      .getOrCreate
    val sc = spark.sparkContext
    val data1 = sc.parallelize(List(1,2,3))
    val data2 = sc.parallelize(List(3,4,5))
    val intersectfunc = data1.intersection(data2)
    println(intersectfunc.collect().mkString)


  }
}
