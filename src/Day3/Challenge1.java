package Day3;

import java.util.Locale;

public class Challenge1 {
    public static void main(String[] args) {
        String word = "Programming";
        StringBuilder a = new StringBuilder(word);

        int length = a.length();
        char Character = a.charAt(0);
        char Charecter2 = a.charAt(a.length()-1);
        String case1 = a.toString().toUpperCase();
        String case2 = a.toString().toLowerCase();

        System.out.println("Total Characters:"+length);
        System.out.println("First Character:"+Character);
        System.out.println("Last Character:"+Charecter2);
        System.out.println("Uppercase:"+case1);
        System.out.println("Lowercase:"+case2);

    }
}
