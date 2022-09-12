import scala.io.StdIn.readLine
object tutorial7 {

    def main(args: Array[String]):Unit = {

        //Q1 - x.neg
        var r1 = new rational(1,2);
        println(s"Negative of $r1 = ${r1.neg}");

        //Q2 - x-y-z
        var x = new rational(3,4);
        var y = new rational(5,8);
        var z = new rational(2,7);

        printf(s"$x - $y - $z = ${x-y-z}");
        
    }

    class rational(x:Int, y:Int){
        def numer = x / gcd(x,y);
        def denom = y / gcd(x,y);

        def +(that:rational) = new rational(numer*that.denom + that.numer*denom, denom*that.denom);
        def -(that:rational) = this + that.neg;
        def *(that:rational) = new rational(numer*that.numer, denom*that.denom);
        def /(that:rational) = this * that.inv;

        def neg = new rational(-numer, denom);
        def inv = new rational(denom, numer);
        private def gcd(a:Int, b:Int):Int = {
            if(b == 0) 
                if a < 0 then -a else a
            else 
                gcd(b, a%b);
        }
        
        override def toString = s"$numer/$denom";
    }

    

}
