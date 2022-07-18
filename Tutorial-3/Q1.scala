import scala.compiletime.ops.float
object tutorial3 {

    val pi = 3.14

    def main(args: Array[String]):Unit ={
        println("Area of the disk = " + area(5));
    }

    def area(radius:Int):Double ={
        //Total sal calculation and tax reduction
        var area:Double = pi * radius * radius;
        return area;
    }

}