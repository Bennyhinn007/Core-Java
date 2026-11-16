package Day4;

import java.util.HashMap;

public class NonRepeating {
    public static void main(String[] args) {


    String word = "success";

    HashMap<Character, Integer> map = new HashMap<>();
    //words count
    for(int i=0; i<word.length(); i++){

        char ch = word.charAt(i);

        map.put(ch, map.getOrDefault(ch,0)+1);

    }
//non-repeating char
    for(int i=0; i<word.length(); i++){

        char ch=word.charAt(i);

        if(map.get(ch)==1){
            System.out.println("The First non-repeating character is:" + ch);
            break;
        }


    }
    }
}
