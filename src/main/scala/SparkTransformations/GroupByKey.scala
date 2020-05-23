package SparkTransformations

import org.apache.spark.sql.SparkSession

object GroupByKey {
  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession.builder.master("local").appName("transformations")
      .getOrCreate
    val sc = spark.sparkContext

    val data = sc.parallelize(Seq(("C",3),("A",1),("B",4),("A",2),("B",5)))
    val groupfunc = data.groupByKey()

    groupfunc

    println(groupfunc.collect().mkString)




  }
}