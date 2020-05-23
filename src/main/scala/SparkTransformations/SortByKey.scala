package SparkTransformations

import org.apache.spark.sql.SparkSession

object SortByKey {
  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession.builder.master("local").appName("transformations")
      .getOrCreate
    val sc = spark.sparkContext

   val data = sc.parallelize(Seq(("C",3),("A",1),("D",4),("B",2),("E",5)))
    val sortfunc = data.sortByKey()

    println(sortfunc.collect().mkString)

  }
}
