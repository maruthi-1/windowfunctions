package shankar

object Threadpool {
  def main(args:Array[String])
  {


    val pool = java.util.concurrent.Executors.newFixedThreadPool(2)

    1 to 10 foreach { x =>
      pool.execute(
        new Runnable {
          def run {

            Thread.sleep(2000)
            println("n: %s, thread: %s".format(x, Thread.currentThread.getId))
          }
        }
      )
    }

  }

}
