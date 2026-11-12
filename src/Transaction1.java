interface Payment1{
    void pay();

   default void PaymentDetails(){
        System.out.println("Transaction completed successfully.");
    }
}

class UPI1 implements Payment1{

    public void pay(){
        System.out.println("Payment through UPI");
    }
}

class Netbanking implements Payment1{

    @Override
    public void pay() {
        System.out.println("Payment through NetBanking");
    }
}

class CreditCard implements Payment1{

    @Override
    public void pay() {
        System.out.println("Payment through Credit Card");
    }
}

public class Transaction1 {

    public static void main(String[] args) {


        UPI1 u = new UPI1();
        Netbanking n = new Netbanking();
        CreditCard c = new CreditCard();


        u.pay();
        u.PaymentDetails();

        n.pay();
        n.PaymentDetails();
        c.pay();
        c.PaymentDetails();
    }
}
