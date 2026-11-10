 class Person1 {

     String name;
     int age;

     void Details() {
         System.out.println("The person name is:" + name);
         System.out.println("Person age is:" +age);

     }
 }

    class Student1 extends Person1{

        String USN;
        String Dept;

        void College(){
            System.out.println("His USN is:"+USN);
            System.out.println("He is enrolled in:" +Dept);
        }


    }

    public class Person{

        public static void main(String[] args) {

            Student1 s = new Student1();

            s.name = "Benny";
            s.age = 21;
            s.USN = "3GN23IC014";
            s.Dept = "Computer Science";

        s.Details();
        s.College();
        }
    }


