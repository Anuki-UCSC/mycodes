
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
       
        for(x <-0 to 7 ){
              println(bank(x).toString)
          }
       
    }
    
   
    
class Account(id:String,n: Int, b: Double) {
    val nic:String=id
    val acnumber: Int = n
    var balance: Double = b
    
    override def toString ="[  "+nic+"  :   "+acnumber +"  :  "+ balance+"  ]"
    def withdraw(a:Double) =this.balance=this.balance-a
    def deposit(a:Double) =this.balance=this.balance+a
    //def transfer(a:Account,b:Double)= 
}
}

