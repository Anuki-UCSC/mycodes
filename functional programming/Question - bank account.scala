
object Assignment_05_part2 {
    def main(args: Array[String]) {
        val acc1=new Account("988581682v",0001,12000)
        val acc2=new Account("893245774v",0002,1000)
        val acc3=new Account("898334555v",0003,-2000)
        val acc4=new Account("987765544v",0004,-529)
        val acc5=new Account("975644234v",0005,12000)
        val acc6=new Account("987533423v",0006,160)
        val acc7=new Account("996754534v",0007,102000)
        
        var bank:List[Account]=List(acc1,acc2,acc3,acc4,acc5,acc6,acc7)
       
        val find=(n:String,b:List[Account])=>b.filter(x=>x.nic.equals(n)) // find function- search for given nic and print the account details
        val overdraft=(b:List[Account])=> b.filter(x=>x.balance<0) // overdraft function-make a list of accounts that the balance<0
        val balance=(b:List[Account])=> b.reduce((x,y)=>new Account("total amount",0,(x.balance)+(y.balance))) //balance-
        val interest=(b:List[Account])=>b.map(x=> if(x.balance>0){ new Account(x.nic,x.acnumber,x.balance*1.05)} else {new Account(x.nic,x.acnumber,x.balance*0.9)}) //interest function-
        def printAc(b:List[Account]) = b.foreach(x=>println(x.toString))
        
         printAc(bank)
         println("\n\nfind : \n\t"+find("987765544v",bank) +"\n\n")
         println(" overdraft :\n\t"+ overdraft(bank) +"\n\n")
         println(" total amount in the bank is  :\n\t"+ balance(bank) +"\n\n")
         val bank2=interest(bank);printAc(bank2)
         println("\n after the process of interest calculation  :\n\t"+ balance(bank2) +"\n\n")
         
    }
    
   
    
class Account(id:String,n: Int, b: Double) {
    val nic:String=id
    val acnumber: Int = n
    var balance: Double = b
    
    override def toString ="[  "+nic+"  :   "+acnumber +"  :  "+ balance+"  ]"
    def withdraw(a:Double) =this.balance=this.balance-a
    def deposit(a:Double) =this.balance=this.balance+a
    def transfer(a:Account,b:Double)= {this.withdraw(b); a.deposit(b)}  // transfer function- which transfer the money from this account to a given account.
}
}
