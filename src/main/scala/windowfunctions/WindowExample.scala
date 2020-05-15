package windowfunctions

import org.apache.flink.streaming.api.scala._
import org.apache.flink.streaming.api.windowing.time.Time

object WindowExample {

  def main(args: Array[String]) {
    val env = StreamExecutionEnvironment.getExecutionEnvironment

    val source = env.socketTextStream("localhost",9000)
    //word map

    val values = source.flatMap(value => value.split(" "))

    val tt  = values.map(value => (value,1))
    val keyValue = tt.keyBy(0)

    keyValue.print()


    //tumbling window : Calculate wordcount for each 15 seconds
    val tumblingWindow = keyValue.timeWindow(Time.seconds(15))
    // sliding window : Calculate wordcount for last 5 seconds
  // val slidingWindow = keyValue.timeWindow(Time.seconds(5),Time.seconds(4))
    //count window : Calculate for every 5 records
 //   val countWindow = keyValue.countWindow(2)


  tumblingWindow.sum(2).name("tumblingwindow").print()
 // slidingWindow.sum(1).name("slidingwindow").print()
  // countWindow.sum(1).name("count window").print()

    env.execute()


  }

}
