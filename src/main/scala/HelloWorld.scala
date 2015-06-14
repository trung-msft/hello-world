/**
 * Created by trung on 6/13/15.
 */
object HelloWorld {

  def main(args: Array[String]): Unit = {
    println("hello world " + (if (args.length > 0) args(0) else ""))
  }

}
