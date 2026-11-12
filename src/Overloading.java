
public class Overloading{

    void calcu(int a,  int b){

        int sum=a+b;

        System.out.println("the sum of a and b is:"+sum);
    }

    void calcu(int a, int b, int c){
        int sum=a+b+c;
        System.out.println("the sum of a, b and c is:"+sum);
    }

    void calcu(double a, double b){

        double sum=a+b;

        System.out.println("the double sum of a and b is:"+sum);
    }

    public static void main(String[] args) {

        Overloading o = new Overloading();

        o.calcu(10,20);
        o.calcu(10,20,30);
        o.calcu(10.33, 20.3456);
    }
}




