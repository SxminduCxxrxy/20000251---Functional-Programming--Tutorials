import scala.compiletime.ops.float
object tutorial3 {

    val price:Double = 24.95
    val discount:Double = 0.40
    val shipping:Double = 3.00

    def main(args: Array[String]):Unit ={
        var cost = t_cost(60);
        println("Cost of Books = Rs. " + f"$cost%1.2f");
    }

    def shipping(nos:Int):Double = {
        if (nos <= 50) {
            return nos * shipping;
        }
        else {
            return (50 * shipping) + ((nos-50) * (shipping + 0.75));
        }
    }

    def t_price(nos:Int):Double = (nos * price)

    def discount(nos:Int):Double = t_price(nos) * discount

    def t_cost(nos:Int):Double = t_price(nos) - discount(nos) + shipping(nos)

}