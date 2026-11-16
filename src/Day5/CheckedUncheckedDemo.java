package Day5;

import java.io.FileReader;
import java.io.IOException;

public class CheckedUncheckedDemo {

    static void readfile() throws IOException{
        FileReader file = new FileReader("data.txt");
        System.out.println("File read success!");
        file.close();
    }

    public static void main(String[] args) {
        try {
            readfile();
        } catch (IOException e) {
            System.out.println("Error:"+e.getMessage());
        }
        try{
            int result = 10/0;
            System.out.println("The result is:"+result);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled!");

        }
    }
}
