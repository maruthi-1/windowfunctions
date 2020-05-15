package dinesh

object Futures123  extends App {


  println("Step 1: Define a method which returns a Future")

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  def donutStock(donut: String): Future[Int] = Future {
    // assume some long running database operation
    println("checking donut stock")
    10


  }
    println("\nStep 2: Call method which returns a Future")
    import scala.concurrent.Await
    import scala.concurrent.duration._
    val vanillaDonutStock = Await.result(donutStock("vanilla donut"), 5 seconds)
    println(s"Stock of vanilla donut = $vanillaDonutStock")




  println("\nStep 2: Non blocking future result")
  import scala.util.{Failure, Success}
  donutStock("vanilla donut").onComplete {
    case Success(stock) => println(s"Stock for vanilla donut = $stock")
    case Failure(e) => println(s"Failed to find vanilla donut stock, exception = $e")
  }
  Thread.sleep(3000)

  println("\nStep 4: Define another method which returns a Future")
  def buyDonuts(quantity: Int): Future[Boolean] = Future {
    println(s"buying $quantity donuts")
    true
  }


  println("\nStep 5: Chaining Futures using flatMap")
  val buyingDonuts: Future[Boolean] = donutStock("plain donut").flatMap(qty => buyDonuts(qty))
  import scala.concurrent.Await
  import scala.concurrent.duration._
  val isSuccess = Await.result(buyingDonuts, 5 seconds)
  println(s"Buying vanilla donut was successful = $isSuccess")

}