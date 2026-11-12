class Teacher1 {
    String name;
    int age;

  Teacher1(String name, int age){
      this.name=name;
      this.age=age;
      System.out.println("Constructor is called!");
  }

}

class Details extends Teacher1{

    String Department;
    int salary;


    Details(String name, int age,String Department, int salary){
        super(name,age);
        this.Department=Department;
        this.salary=salary;

        System.out.println("Child class is called!");
    }
    void Details(){
        System.out.println("Teacher name is:"+name);
        System.out.println("His age is:"+age);
        System.out.println("He teaches in:"+Department);
        System.out.println("His salary is:"+salary);
    }
}

public class Teacher{

    public static void main(String[] args) {
         Details t = new Details("Benny", 21, "CSE(ICB)", 1000000);

         t.Details();



    }
}