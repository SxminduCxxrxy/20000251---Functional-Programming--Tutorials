
object tutorial5 {

    def main(args: Array[String]):Unit ={

        println(isEven(9))

    }

    def isEven(number:Int):Boolean = number match {
        case 0 => true
        case _ => isOdd(number - 1)
    }

    def isOdd(number:Int):Boolean = (!isEven(number))

}