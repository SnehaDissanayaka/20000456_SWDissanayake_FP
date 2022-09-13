object t7q3 extends App {
    var accountList:List[Account] = List()

    def accCreate(nic:String, accId: Int):Unit = {
        val acc = new Account(nic, accId)
        accountList = accountList ::: acc :: Nil
        printf("Account List : %s\n",accountList)
    }

    val find = (a:Int, b:List[Account]) => b.filter(account => account.accId.equals(a))
  
    accCreate("200077893421",1)
    accCreate("200134562309",2)

    //deposit money
    find(1, accountList)(0).deposit(1000)
    printf("Deposited to: %s\n",find(1, accountList)(0))

    //transfer money
    find(1, accountList)(0).transfer(2, 100.0)
    printf("Transfered to: %s\n",find(2, accountList)(0))
}

class Account(nic:String, val accId: Int, var balance: Double = 0.0){

    def withdrow(amount:Double) : Unit = {
        this.balance = this.balance - amount
    }

    def deposit(amount:Double) : Unit = {
        this.balance = this.balance + amount
    }

    def transfer(account:Int, amount:Double) : Unit = {
        val transferAcc = t7q3.find(account, t7q3.accountList)
        if (balance < 0.0) println("Insufficient balance")
        else {
            this.withdrow(amount)
            transferAcc(0).deposit(amount)
        }
    }

    override def toString = "["+nic+":"+accId +":"+ balance+"]"
}
