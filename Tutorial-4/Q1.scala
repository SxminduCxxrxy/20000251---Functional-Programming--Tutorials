import scala.io.StdIn.readLine

object tutorial4 {

    def main(args: Array[String]):Unit ={
        val amount:Double = readLine("Insert Deposit Amounts : Rs.").toDouble
        val interest:Double = interest_calculator(amount) 
        println("Interest Amount : Rs." + interest)
    }

    def interest_calculator(amount:Double):Double = amount match{
        case x if (x > 0) && (x <= 20000) => amount * 0.02
        case x if (x <= 200000) => amount * 0.04
        case x if (x <= 2000000) => amount * 0.035
        case x if (x > 2000000)  => amount * 0.065
    }

}