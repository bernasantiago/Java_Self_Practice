package JD07_class_scanner;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.name = "Josh";
        employee1.age = 25;                   // they all instance variables
        employee1.gender = 'M';
        employee1.jobTitle = "Server";
        employee1.salary = 50_00;

       employee1.work();
        System.out.println("employee1 = " + employee1);

        Employee employee2 = new Employee();

        employee2.name = "Julian";
        employee2.age = 28;                   // they all instance variables
        employee2.gender = 'F';
        employee2.jobTitle = "Nurse";
        employee2.salary = 80_00;

        employee2.work();
        System.out.println("employee2 = " + employee2);




    }
}
