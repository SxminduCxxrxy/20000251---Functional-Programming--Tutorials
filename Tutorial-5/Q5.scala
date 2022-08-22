
object tutorial5 {

    def main(args: Array[String]):Unit ={

        println(sumEven(22))

    }

    def sumEven(number:Int):Int = number match {
        case number if number <= 2 => 0
        case number if (number - 1) % 2 == 0 => (number - 1) + sumEven(number - 1)
        case number => sumEven(number - 1)
    }

}