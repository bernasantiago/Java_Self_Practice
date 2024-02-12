package JD07_class_scanner;


import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);

        System.out.println("Enter your score: ");

        int score = grade.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid Score");

        } else if (score >= 90) {
            System.out.println("Your grade is A");

        } else if (score >= 80) {
            System.out.println("Your grade is B");

        } else if (score >= 70) {
            System.out.println("Your grade is C");

        } else if (score >= 60) {
            System.out.println("Your grade is D");

        } else {
            System.out.println("Your grade is F");
        }
        grade.close();


    /*
    7. Create a class named GradeReport and write a program asking the user to enter their score and print the student's grade.

  If the user enters an invalid score (negative or more than 100), print "Invalid Score."

        Example:
             Enter your score:
             Input: 85

        Output:
             Your grade is B

     */
    }
}
