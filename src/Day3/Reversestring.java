package Day3;

public class Reversestring {

        public static void main(String[] args) {

            String name = "Benny";

            StringBuilder sb = new StringBuilder(name);

            String reversed = sb.reverse().toString();

            System.out.println("Original: " + name);
            System.out.println("Reversed: " + reversed);
        }
    }

