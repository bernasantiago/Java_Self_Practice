package JD06_methods;

public class SalaryCalculator {
    public static void main(String[] args) {


        double income = salary(45.0,40);
        System.out.println(income);

    }

    public static double salary (double a , int b){
       double s = (a * b) *52 ;
       return s;                           // instead of printing , returning the value.


    }
}
/*
4. Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
and weekly hours (int) and returns the salary.

			Example:
				double income = salary(45, 40);

			Output:
				93600.0
 */