public class Student {

    int id;
    String name;
    float cgpa;

    Student(String name, int id, float cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
        System.out.println("----------------");


    }

}
