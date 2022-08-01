
object tutorial4 {

    def main(args: Array[String]):Unit ={

        var names = Array[String]("Benny", "Niroshan", "saman", "Kumara")

        println(formatNames(names(0))(toUpper(_)))
        println(formatNames(names(1).substring(0,2))(toUpper(_)) + formatNames(names(1).substring(2))(toLower(_)))
        println(formatNames(names(2))(toLower(_)))
        println(formatNames(names(3).substring(0,1))(toUpper(_)) + formatNames(names(3).substring(1,5))(toLower(_)) + formatNames(names(3).substring(5))(toUpper(_)))
    }

    def formatNames(name:String)(caseFunction:String=>String):String =  {
        caseFunction(name)
    }

    def toUpper(string:String):String = string.toUpperCase

    def toLower(string:String):String = string.toLowerCase


}