package Unit02;

public class unit2 {public static void main(String[] args) {
        System.out.println("Main");
        Student student = new Student();
        student.rollno = 1;
        student.gen ='M';
        student.name="GOGO";
        System.out.println("Student"+student.name);
        student.register();


    }
}
class Student {
    int rollno;
    char gen;
    String name;
    void register() {
        System.out.println("Register");
    }
}
