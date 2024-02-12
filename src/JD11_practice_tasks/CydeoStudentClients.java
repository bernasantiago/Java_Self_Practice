package JD11_practice_tasks;

public class CydeoStudentClients {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Alex", 28,"12345",'A',2023,6);

        System.out.println("student1 = " + student1);

        System.out.println(student1.study());
        System.out.println(student1.attendClass());
        System.out.println(student1.printSchoolName());
        System.out.println(student1.printProgLanguage());


        CydeoStudent student2 = new CydeoStudent("Sierra",35,"09876",'C',2024,4);

        System.out.println("student2 = " + student2);

        System.out.println(student2.study());
        System.out.println(student2.attendClass());
        System.out.println(student2.printSchoolName());
        System.out.println(student2.printProgLanguage());


    }
}
