import Array._


/**
 * Created by trung on 6/13/15.
 */

trait tFoo {
}

object tFoo{
  val limit = 100
}

class Bar extends tFoo
{

}


object HelloWorld {

  def main(args: Array[String]): Unit = {
     var k: tFoo = new Bar()

    println("hello world " + k.limit)

  }

}
