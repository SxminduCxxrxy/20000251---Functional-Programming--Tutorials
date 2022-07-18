import scala.compiletime.ops.float
object tutorial3 {

    val pi = 3.14

    def main(args: Array[String]):Unit ={
        println("Volume of the sphere = " + volume(5));
    }

    def volume(radius:Int):Double ={
        //Total sal calculation and tax reduction
        var volume:Double = (4.0/3.0) * pi * (radius * radius * radius);
        return volume;
    }

}