
object tutorial5 {

    def main(args: Array[String]):Unit ={

        println(sum(5))

    }

    def sum(number:Int):Int = {

        if (number == 1)
            return 1
        
        return number + sum(number - 1)
    }


}