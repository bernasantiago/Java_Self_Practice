package JD11_practice_tasks;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String jobTitle, String name){

        this.jobTitle=jobTitle;
        this.name=name;

    }
    public Employee(String jobTitle, String name, char gender){
        this(jobTitle,name);
        this.gender=gender;

    }

    public Employee(String jobTitle,String name, char gender,double salary){
        this(jobTitle,name,gender);
        this.salary=salary;
    }

    public String work(){

        return jobTitle + name + " is working.";
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
3. Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.
 */