package Day5;
//Problem: Student Eligibility System

class InvalidAgeException extends Exception{

    public InvalidAgeException(String Message){
        super(Message);
    }
}

class Student {
    int age = 18;

    public void AgeEligibility(int age)
            throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Ineligible");
        } else {
            System.out.println("Eligible");
        }

    }
}
    public class StudentEligibility {

        public static void main(String[] args) {

            Student s = new Student();

            try {
                s.AgeEligibility(05);
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Exception Handled!");
        }
    }

