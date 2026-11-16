package Day5;

class InsufficiantFundsException extends Exception{
    public InsufficiantFundsException(String Message){
        super(Message);
    }
}

class Bank{
     double balance=10000;

     public void Withdraw(double amount)
         throws InsufficiantFundsException{

         if(balance<amount){
             throw new InsufficiantFundsException("Insufficient Funds!");
         }

         balance-=amount;
         System.out.println("Withdraw Successfull!");
         System.out.println("Remaining Balance is:"+balance);

     }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Bank b = new Bank();

        try {
            b.Withdraw(12000);
        }catch (InsufficiantFundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Banking session Complete!");
    }
}
