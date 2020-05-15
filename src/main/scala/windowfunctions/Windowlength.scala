package windowfunctions

import org.apache.flink.streaming.api.scala._
import org.apache.flink.streaming.api.windowing.time.Time


object Windowlength {
  def main(args: Array[String]) {
    val env = StreamExecutionEnvironment.getExecutionEnvironment

    val source = env.socketTextStream("localhost", 9000)
    //word map

    val values = source.flatMap(value => value.split(" "))
    val tt  = values.map(value => (value,value.size))
    val keyValue = tt.keyBy(0)

    val tumblingWindow = keyValue.timeWindow(Time.seconds(15))
    tumblingWindow.sum(1).name("tumblingwindow").print()

    env.execute()

  }
}
