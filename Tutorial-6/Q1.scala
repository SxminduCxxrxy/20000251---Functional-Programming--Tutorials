
object tutorial6 {

    def main(args: Array[String]):Unit ={

        var en:String = cypher(alphabet, 19)(encrypt(_,_));
        println(en);
        var de:String = cypher(en, 19)(decrypt(_,_));
        println(de);
        
    }

    var alphabet = "abcdefghijklmnopqrstuvwxyz";

    def encrypt(char:Char, key:Int):Char = {

        var index = alphabet.indexOf(char.toLower);

        if (index + key >= alphabet.length) {
            return alphabet.charAt((index + key) % alphabet.length);
        }
        else {
            return alphabet.charAt(index + key);
        }

    }
    
    def decrypt(char:Char, key:Int):Char = {
        
        var index = alphabet.indexOf(char.toLower);

        if (index - key < 0) {
            return alphabet.charAt(25 - (((25 - index) + key) % alphabet.length) );
        }
        else {
            return alphabet.charAt(index - key);
        }

    }

    def cypher(string:String, key:Int)(bcrypt:(Char, Int) => Char):String = {
        var output:String = string.map(bcrypt(_, key));
        return output;
    }

}
