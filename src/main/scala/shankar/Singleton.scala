package shankar

class Singleton {
    var length = 20;
    var height = 40;
    def area()
    {
      var ar = length * height;
      println("Height of the rectangle is:" + height);
      println("Length of the rectangle is:" + length);
      println("Area of the rectangle is :" + ar);
    }
  }

  // singleton object
  object Main
  {
    def main(args: Array[String])
    {

      // Creating object of AreaOfRectangle class
      var obj1 = new Singleton();
      var obj2 = new Singleton();

      obj1.area()
      obj2.area()
    }

  }


