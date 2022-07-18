import scala.compiletime.ops.float
object tutorial3 {

    def main(args: Array[String]):Unit ={
        println("Run Time = " + runtime() + "min");
    }

    def runtime():Int = (2*2*8)  + (3 * 7)

}