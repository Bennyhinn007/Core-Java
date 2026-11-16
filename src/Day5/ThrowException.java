package Day5;

public class ThrowException {
    public static void main(String[] args) {
        int age = 17;

        if (age < 18) {
            throw new ArithmeticException("Not aligible to vote");
        }
        System.out.println("Eligible to vote");
    }
}
