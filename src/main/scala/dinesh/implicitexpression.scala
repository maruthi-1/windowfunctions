package dinesh

object implicitexpression  extends App {

    implicit class StringEnhancer(str: String) {
      def withoutVowels: String = str.replaceAll("[aeiou]", "")
    }
  }


