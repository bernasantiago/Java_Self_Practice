package JD13_oop_intheritance.Student;

public class Student {

    private String name, gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, String gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
1. Create a class named "Student" with the following specifications:
   Attributes:
       - name: String
       - age: int
       - gender: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Actions:
       - toString(): Prints the information of the Student object.
 */