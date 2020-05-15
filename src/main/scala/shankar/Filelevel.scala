package shankar

import java.io.File
import scala.io.Source
object Filelevel extends App {

    val folderName = "/home/maruthi/file/"

    val pool = java.util.concurrent.Executors.newFixedThreadPool(4)

    def getListOfFiles(dir: String):List[File] = {

      val d = new File(dir)
      if (d.exists && d.isDirectory) {
        d.listFiles.filter(_.isFile).toList
      } else {
        List[File]()
      }
    }

    val files = getListOfFiles(folderName)
    files.foreach(x => {

      val fSource = Source.fromFile(x)
      for (line <- fSource.getLines) {
        pool.execute(
          new Runnable {
            def run {

              Thread.sleep(1000)
              println("n: %s, thread: %s".format(line, Thread.currentThread.getId))
            }

          }
        )
      }
      fSource.close()

    })

    pool.shutdown()

  }
