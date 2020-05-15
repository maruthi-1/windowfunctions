package shankar

import org.apache.spark.sql.SparkSession

object Sparkwordcount {
  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession.builder.master("local").appName("wordcount")
      .getOrCreate
    val sc = spark.sparkContext

    val  rdd123 = sc.parallelize(List("Hello Hello Spark Apache Hello Dataneb Dataneb Dataneb Spark"))


      .flatMap(words => words.split(" "))
      .map(x=>(x,1))
      .reduceByKey((x, y)=>x+y)
      .collect
    println(rdd123.mkString)

    val a= spark.sparkContext.parallelize(Array("Hello Hello Spark Apache Hello Dataneb Dataneb Dataneb Spark"))
      .flatMap(words => words.split(" "))
      .map(x=>(x,1))
    .foldByKey(0)(_+_)
      .collect
  println(a.mkString)



  }
}
