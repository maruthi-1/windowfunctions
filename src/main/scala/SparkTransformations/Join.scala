package SparkTransformations

import org.apache.spark.sql.SparkSession

object Join extends  App {
  val spark: SparkSession = SparkSession.builder.master("local").appName("transformations")
    .getOrCreate
  val sc = spark.sparkContext
    val data1 = sc.parallelize(Seq(("A",1),("B",2),("C",3)))
    val data2 = sc.parallelize(Seq(("C",7),("B",4),("E",5)))
    val cogroupfunc = data1.cogroup(data2)
    val joinfunc = data1.join(data2)

    println(cogroupfunc.collect().mkString)
    println(joinfunc.collect().mkString)


}
