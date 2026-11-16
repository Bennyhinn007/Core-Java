package Day4;

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {

        String word ="swiss";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<word.length(); i++ ){

            char ch = word.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);


        }
        System.out.println(map);
    }
}
