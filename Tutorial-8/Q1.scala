import scala.io.StdIn.readLine
object tutorial8 {

    def main(args: Array[String]):Unit = {

        val p1 = Point(1,2);
        val p2 = Point(3,4);

        //Addition of Two Points
        val p3 = p1 + p2;
        println(s"$p1 + $p2 = $p3");
        println();

        //Moving a Point
        val p4 = p1.move(2,3);
        println(s"Move $p1 by (2,3) = $p4");
        println();

        //Calculating Distance
        println(f"Distance between $p1 & $p2 = ${p1.distance(p2)}%.2f");
        println();

        //Inverting a Point
        val p5 = p1.invert();
        println(s"Inverse of $p1 = $p5");
    }

    case class Point(a:Int, b:Int){

        def x = a;
        def y = b;

        def +(that:Point) = Point(this.x + that.x,this.y + that.y);

        def move(dx:Int, dy:Int) = Point(this.x + dx, this.y + dy);

        def distance(that:Point) = Math.sqrt(Math.pow(this.x - that.x,2) + Math.pow(this.y - that.y,2));

        def invert() = Point(this.y,this.x);

        override def toString = s"($x,$y)";
    }

}
