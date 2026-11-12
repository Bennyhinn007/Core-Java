package Day3;

public class Palindrome {

    public static void main(String[] args) {

        String word ="madan";
                StringBuilder m = new StringBuilder(word);

                String reverse = m.reverse().toString();

       word.equals(reverse);

       if(word.equals(reverse)){
           System.out.println("Palindrome");
       }else {
           System.out.println("Not a Palindrome!");
       }
        System.out.println("Original:"+word);
        System.out.println("Reverse:"+reverse);

    }
}
