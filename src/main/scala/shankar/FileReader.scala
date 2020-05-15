package shankar

import scala.io.Source


// Creating object
  object FileReader {
  def main(args: Array[String]) {
    val pool = java.util.concurrent.Executors.newFixedThreadPool(2)
    val fname = "/home/maruthi/file/Data.txt"
    val fSource = Source.fromFile(fname)
    for (line <- fSource.getLines) {
      pool.execute(
        new Runnable {
          def run {
//            Thread.sleep(1000)
            println("n: %s, thread: %s".format(line, Thread.currentThread.getId))
          }
        }
      )
    }
    pool.shutdown()
    fSource.close()

  }
}