abstract class Animal{

    void eat(){
        System.out.println("Animal is eating");
    }

   abstract void sound();
}

class Dog extends Animal{

    void sound(){
        System.out.println("Dog Barks!!");
    }

}
class Cat extends Animal{

    void sound(){
        System.out.println("Cat Meows!!");
    }
}

public class Abstraction {
    public static void main(String[] args) {


        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.sound();
        c.eat();
        c.sound();
    }
}
