import scala.io.StdIn.readLine
object tutorial7 {

    def main(args: Array[String]):Unit = {

        //Account Creation
        createAccount("Samindu", 10001, 1000);
        createAccount("Trasheni", 10002, 1000);
        createAccount("Pasindu", 10003, 1000);
        createAccount("Nadeesha", 10004, 1000);
        createAccount("Dilky", 10005, 1000);
        createAccount("Varsha", 10006, 1000);
        createAccount("Harini", 10007, 1000);
        createAccount("Rusiru", 10008, 1000);
        createAccount("Tharushi", 10009, 1000);
        createAccount("Dilmi", 10010,   1000);
        createAccount("Hasala", 10011, 1000);
        createAccount("Gineth", 10012, 1000);
        createAccount("Sahan", 10013,   1000);

        //Transfer Operations
        getAccount(10001).transfer(getAccount(10002), 2000);
        getAccount(10003).transfer(getAccount(10004), 2000);
        getAccount(10006).transfer(getAccount(10005), 2000);
        getAccount(10008).transfer(getAccount(10007), 2000);

        //Print Account Details
        println("\nNegative Balance Accounts");
        getnegBalanceAccts();

        println("Sum of all account balances");
        sumAllBalances();

        println("Calculate Interest");
        intrestCal();        
        
    }

    var bank:List[account]=List();

    def createAccount(name:String, id:Int, balance:Double):Unit = {

        if (inBank(name, id) == true){
            println("Account number already exists");
            
        }
        else {
            bank = bank :+ new account(name, id, balance);
            println("Account Created")
        }

    }

    def getAccount(acctNo:Int):account = {

        return bank.filter(account => account.acctNo == acctNo)(0);
         
    }

    def getnegBalanceAccts():Unit = {

        var accts:List[account] = bank.filter(x => x.balance < 0);
        println(accts);
        println("\n");

    }

    def sumAllBalances():Unit = {

        var sum:Double = bank.map(x => x.balance).reduce((x, y) => x + y);

        println(f"$sum%.2f");
        println("\n");

    }

    def intrestCal():Unit = {

        bank.map(account => if account.balance > 0 then  account.deposit(account.balance * 0.05) else account.deposit(account.balance * 0.1));

        println(bank);
        println("\n");

    }

    class account(x:String, y:Int, z:Double = 0.00){

        def name = x;
        def acctNo = y;
        var balance = z;

        def withdraw(amount:Double) = {
            this.balance = this.balance - amount;
        }
        def deposit(amount:Double) = {
            this.balance = this.balance + amount;
        }
        def transfer(that:account,amount:Double) = {
            this.withdraw(amount);
            that.deposit(amount);
        };
        
        override def toString = f"Name: $name%s | Account No: $acctNo%d | Balance: Rs.$balance%.2f";
    }

    def inBank(name:String, acctNo:Int):Boolean = {
        for (i <- bank){
            if (i.name == name && i.acctNo == acctNo){
                return true;
            }
        }
        return false;
    }

    

}

