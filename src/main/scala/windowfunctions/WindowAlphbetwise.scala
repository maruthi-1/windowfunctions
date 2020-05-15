package windowfunctions
import org.apache.flink.streaming.api.scala.{StreamExecutionEnvironment, _}
import org.apache.flink.streaming.api.windowing.time.Time

object WindowAlphbetwise {
  def main(args: Array[String]) {
    val env = StreamExecutionEnvironment.getExecutionEnvironment

    val source = env.socketTextStream("localhost", 9000)
    //word map


    val values = source.flatMap(value => value.split(" "))
    val tt  = values.map(value => (value.charAt(0), 1))

//val s=tt.map(x => ((x._1), (x._2),(x._3)) )

    val keyValue = tt.keyBy(0)
    val tumblingWindow = keyValue.timeWindow(Time.seconds(15))
    tumblingWindow.sum(1).name("tumblingwindow").print()
    env.execute()

  }
}
