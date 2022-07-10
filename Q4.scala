import scala.compiletime.ops.float
object tutorial1 {

    def main(args: Array[String]):Unit ={
        println("Question 4(a):");
        println("Total Salary = Rs."+salary(40,30)+"/=");
        println();
        println("Question 4(b):");
        println(profit(5) + "," + profit(10) + "," + profit(15) + "," + profit(20) + "," + profit(25) + "," + profit(30) + "," + profit(35) + "," + profit(40));
    }

    def salary(workhours:Int, othours:Int):Double ={
        //Total sal calculation and tax reduction
        var total:Double = ((workhours * 250) + (othours * 85)) * 0.88;
        return total;
    }

    def attendees(price:Int):Int = 120+(15-price)/5*20
    def revenue(price:Int):Int = attendees(price)* price
    def cost(price:Int):Int = 500+attendees(price)
    def profit(price:Int):Int = revenue(price)- cost(price)


}