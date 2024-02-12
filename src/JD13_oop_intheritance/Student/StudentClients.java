package JD13_oop_intheritance.Student;

public class StudentClients {
    public static void main(String[] args) {

        Student student = new Student("James", "Male", 18);

        System.out.println(student);

        CydeoStudent cydeoStudent = new CydeoStudent("Alex","Male",21, "1234", "1",
                'A', "Cydeo");

        System.out.println(cydeoStudent);
        cydeoStudent.study(); // Alex Cydeo;


        CollegeStudent collegeStudent = new CollegeStudent("Cindy", "Female", 22, "9238", "2",
                'B', "Grossmont College");

        System.out.println(collegeStudent);
        collegeStudent.study();  // Cindy is studying.
    }
}
/*
4. Create a class named "StudentClients":
   - Create multiple objects representing different students.
   - Test the methods and attributes of each object.
 */