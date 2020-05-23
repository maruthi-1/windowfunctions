package dinesh

object EvenOdd extends App {
    def totalnumbers(numbers:List[Int],selector:Int=>Boolean)={
      val total=0;
      for (number<-numbers){
        if (selector(number))total+number
      }
      total
    }
     val numbers=List(1,2,3,4,5,6,7,8,9,10)
    println(totalnumbers(numbers,{numbers=>numbers%2==0}))

//  def totalnumbers(list: List[Int], selector: Int => Boolean):Int = {
//    val sum = 0
//    list.foreach { e => if (selector(e)) sum + e }
//    sum
//  }
//    val number = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//
//
//    println(totalnumbers(number, { e => e%2==0}))

  }
