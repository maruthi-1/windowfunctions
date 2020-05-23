package SparkTransformations
import org.apache.spark.sql.SparkSession

object Groupbyreducebyaggrigationby extends  App {
  val spark: SparkSession = SparkSession.builder.master("local").appName("transformations")
    .getOrCreate
  val sc = spark.sparkContext
//  val  rdd124 = sc.parallelize(List("Hello Hello Spark Apache Hello Dataneb Dataneb Dataneb Spark"))
//    .flatMap(words => words.split(" "))
//    .map(x=>(x,1))
//    .aggregateByKey(0)((x, y)=> x+y, (k, v)=> k+v )
//    .collect
//  println(rdd124.mkString)
//  val  rdd123 = sc.parallelize(List("Hello Hello Spark Apache Hello Dataneb Dataneb Dataneb Spark"))
//
//    .flatMap(words => words.split(" "))
//
//    .map(x=>(x,1))
//
//    .reduceByKey((x, y)=>x+y)
//
//    .collect
//  println(rdd123.mkString)
//  val  rdd125 = sc.parallelize(List("Hello Hello Spark Apache Hello Dataneb Dataneb Dataneb Spark"))
//    .flatMap(words => words.split(" "))
//    .map(x=>(x,1))
//    .groupByKey().map(t => (t._1, t._2.sum))
//    .collect
//  println(rdd125.mkString)
val pairs = sc.parallelize(Array(("a", 3), ("a", 1), ("b", 7), ("a", 5)))
  val resReduce = pairs.reduceByKey(_ + _)
  val resAgg = pairs.aggregateByKey(0)(_+_,_+_)
val groupd=pairs.groupByKey().map(t => (t._1, t._2.sum))
  println(resReduce.collect().mkString)
  println(resAgg.collect().mkString)
  println(groupd.collect().mkString)



}

