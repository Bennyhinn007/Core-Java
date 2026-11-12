class vehicle{

    void sound(){
        System.out.println("Vehicle is Beeping");
    }
}

class car extends vehicle{
    void sound(){
        System.out.println("Car horn is low");
    }
}

public class Overriding {
    public static void main(String[] args) {


        vehicle v = new vehicle();
        vehicle r = new car();

        v.sound();
        r.sound();
    }
}
