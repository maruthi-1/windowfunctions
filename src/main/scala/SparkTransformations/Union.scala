package SparkTransformations

import org.apache.spark.sql.SparkSession

object Union {
  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession.builder.master("local").appName("transformations")
      .getOrCreate
    val sc = spark.sparkContext
    val data1 = sc.parallelize(List(1,2))

    val resultdata1=data1.collect
    println(resultdata1.mkString)
    val data2 = sc.parallelize(List(3,4,5))
    val resultdata2=data2.collect
    println(resultdata2.mkString)
    val unionfunc = data1.union(data2)
    println(unionfunc.collect().mkString)


  }
}