package Day5;

import java.util.ArrayList;

public class Wrapperclass {
    public static void main(String[] args) {
        int a=10;

        Integer b = 100;

        System.out.println("the int a is:"+a);
        System.out.println("The Integer b is:"+b);
        System.out.println("Wrapper class is:"+ b.getClass().getName());


    ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println(arr);

    }
}
