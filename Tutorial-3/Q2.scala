import scala.compiletime.ops.float
object tutorial3 {

    val pi = 3.14

    def main(args: Array[String]):Unit ={
        println("Celcius in Farenheit = " + temp_conversion(35));
    }

    def temp_conversion(cel:Int):Double ={
        //Total sal calculation and tax reduction
        var far:Double =  (cel * 9/5) + 32;
        return far;
    }

}