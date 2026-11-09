public class Student {

    int id;
    String name;
    float cgpa;

    Student(String sName, int sID, float sCGPA){
        name = sName;
        id = sID;
        cgpa = sCGPA;
    }
    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
        System.out.println("----------------");


    }

}
