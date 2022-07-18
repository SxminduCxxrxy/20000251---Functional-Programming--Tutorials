import scala.compiletime.ops.double
import scala.compiletime.ops.string
object tutorial2 {

   def main(args: Array[String]):Unit ={

        //Question 1 & 2
        var (k:Int ,i:Int ,j:Int ) = (2,2,2);
        var (m:Int ,n:Int ) = (5,5);
        var f:Double = 12.0;
        var g:Double = 4.0;
        var C:Char = 'X';

        //Question 3
        println(k + 12 * m);
        println(m / j);
        println(n % j);
        println(m / j * j);  
        println(f + 10 * 5 + g);
            //println(++i * n); The increment operator is note applicable in scala.
        
        var (a:Int, b:Int, c:Int, d:Int) = (2,3,4,5)
        var K:Float = 4.3

        //println( --b * a + c *d--); The increment operator is note applicable in scala.
        //println(a++); The increment operator is note applicable in scala.
        println ((-2) * ( g - K ) +c);
        //println (c=c++); The increment operator is note applicable in scala.
        //println (c=++c*a++);  The increment operator is note applicable in scala.


   }

}