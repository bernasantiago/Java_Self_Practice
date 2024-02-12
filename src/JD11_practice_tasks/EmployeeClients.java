package JD11_practice_tasks;

import java.sql.SQLOutput;

public class EmployeeClients {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Developer ","James");

        System.out.println(employee1);

        Employee employee2= new Employee("Project Manager ","Alana",'F');

        System.out.println(employee2);

        Employee employee3 = new Employee("QA ","Oscar",'M',100_000);

        System.out.println(employee3);


        System.out.println(employee1.work());
        System.out.println( employee2.work());
        System.out.println(employee3.work());
    }
}
