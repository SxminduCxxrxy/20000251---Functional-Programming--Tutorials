import scala.io.StdIn.readLine

object tutorial4 {

    def main(args: Array[String]):Unit ={
        val number:Integer = readLine("Enter a Number : ").toInt
        println(PatternMatching(number))
    }

    def PatternMatching(number:Int):String = negMatch(number) match{
        case "true" => "Negative/Zero"
        case "false"  => (number%2) match {
            case 0 => "Even Number"
            case _ => "Odd Number"
        }
    }

    def negMatch(number:Int):String = number match{
        case x if (x <= 0)  => "true"
        case _ => "false"
    }

}