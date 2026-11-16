package Day5;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsException {

    static void readfile() throws IOException{
        FileReader file = new FileReader("Data.txt");

        System.out.println("File Read successfully");

        file.close();
    }

    public static void main(String[] args) {
        try {
            readfile();
        } catch (IOException e) {
            System.out.println("Error:"+ e.getMessage());
        }
        System.out.println("Exception Handled Successfully!");
    }
}
