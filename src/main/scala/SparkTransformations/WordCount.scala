package SparkTransformations

import org.apache.spark.sql.SparkSession

object WordCount extends  App {
  val spark: SparkSession = SparkSession.builder.master("local").appName("transformations")
    .getOrCreate
  val sc = spark.sparkContext
  val data=sc.textFile("/home/maruthi/sparkdata.txt")
//  val datacollect=data.collect
  val splitdata = data.flatMap(line => line.split(" "));
  val mapdata = splitdata.map(word => (word,1));
 //val wordsss= mapdata.collect;
  val reducedata = mapdata.reduceByKey(_+_);
  val countofresult=reducedata.collect
  println(countofresult.mkString)


}
