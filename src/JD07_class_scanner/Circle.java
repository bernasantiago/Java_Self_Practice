package JD07_class_scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner calculate = new Scanner(System.in);

        System.out.println("Enter the radius: ");

        double radius = calculate.nextDouble();
        double PI = 3.14;

        calculate.close();

        System.out.println("The area of the Circle is "+ radius * radius * PI);
        System.out.println("The perimeter of the Circle is "+ radius * 2* PI);


    }
}
/*
6. Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4
 */