import scala.compiletime.ops.int
object tutorial5 {

    def main(args: Array[String]):Unit ={

        println(Fibonacci(10).sorted )

    }

    def Fibonacci(number:Int, prev1:Int = 0, prev2:Int = 1):List[Int] = number match {
        case 2 =>  List(0,1)
        case _ =>  Fibonacci(number - 1, prev2, prev1 + prev2):+ (prev1 + prev2)
    }

}