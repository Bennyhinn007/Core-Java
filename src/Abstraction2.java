abstract class Bank{

    void BankDetails(){
        System.out.println("Welcome to the Bank");
    }
    abstract void getIntrestRates();
}

class SBI extends Bank{
    @Override
    void getIntrestRates() {
        System.out.println("SBI Interest rate is 7%");
    }
}

class HDFC extends Bank{
    @Override
    void getIntrestRates() {
        System.out.println("HDFC Interest rate is 8%");
    }
}

public class Abstraction2 {
    public static void main(String[] args) {


        SBI s = new SBI();
        HDFC h = new HDFC();

        s.BankDetails();
        s.getIntrestRates();
        h.BankDetails();
        h.getIntrestRates();
    }
}
