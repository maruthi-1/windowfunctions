package SparkTransformations

import org.apache.spark.sql.SparkSession

object Cartesian {
  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession.builder.master("local").appName("transformations")
      .getOrCreate
    val sc = spark.sparkContext
    val data1 = sc.parallelize(List(1,2,3))
    val data2 = sc.parallelize(List(3,4,5))
    val cartesianfunc = data1.cartesian(data2)
    println(cartesianfunc.collect().mkString)
  }
}
