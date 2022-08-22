
object tutorial5 {

    def main(args: Array[String]):Unit ={

        println(primeseq(10))

    }

    def prime(number:Int,base:Int=2):Boolean = base match {
        case x if ( number <= 1 ) => false
        case x if( x == number ) => true
        case x if GCD(number,x) > 1 => false
        case x => prime(number,x+1)
    }

    def primeseq(number:Int):List[Int] = number match {
        case x if( x == 1 ) => List()
        case x if( prime(x) ) => primeseq(x-1) :+ x
        case x => primeseq(x-1)
    }

    def GCD(a:Int,b:Int):Int = b match {
        case 0 => a
        case x if(a%x == 0 && b%x == 0) => x
        case x => GCD(x,a%x)
    }

}