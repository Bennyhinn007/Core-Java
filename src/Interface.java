interface Payment{

     void pay();
}

class UPI implements Payment {

    public void pay(){
        System.out.println("Pay using UPI!");
    }
}
class Debit implements Payment {
    public void pay(){
        System.out.println("Pay using Debit Card!");
    }

}
class Credit implements Payment {
    @Override
    public void pay() {
        System.out.println("Pay using Credit card!!");
    }
}

public class Interface {

    public static void main(String[] args) {
        UPI u = new UPI();
        Credit c = new Credit();
        Debit d = new Debit();

        u.pay();
        c.pay();
        d.pay();
    }

}
