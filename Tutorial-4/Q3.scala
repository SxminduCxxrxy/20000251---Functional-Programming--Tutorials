
object tutorial4 {

    def main(args: Array[String]):Unit ={

        var names = Array[String]("Benny", "Niroshan", "saman", "Kumara")

        println(formatNames(names(0))()(toUpper(_)))
        println(formatNames(names(1))(1,2)(toUpper(_)))
        println(formatNames(names(2))(1)(toLower(_)))
        println(formatNames(names(3))(1,6)(toUpper(_)))

    }

    def formatNames(name:String)(indexL:Int*)(caseFunction:String=>String):String =  {
        
        if (indexL.isEmpty) {
            return caseFunction(name)
        } 

        val sArray = name.toCharArray()
        var temp = ""
        
        for (i <- indexL) {
            temp = caseFunction(sArray(i-1).toString())
            sArray(i-1) = temp.charAt(0)
        }

        return sArray.mkString("")

    }

    def toUpper(string:String):String = string.toUpperCase

    def toLower(string:String):String = string.toLowerCase


}