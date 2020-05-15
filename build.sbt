name := "Window"

version := "0.1"

scalaVersion := "2.12.4"
libraryDependencies += "org.apache.flink" %% "flink-streaming-scala" % "1.10.0"
//// https://mvnrepository.com/artifact/com.sparkjava/spark-core
//libraryDependencies += "com.sparkjava" % "spark-core" % "2.9.1"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.5"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.5"