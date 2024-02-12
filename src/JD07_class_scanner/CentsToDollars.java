package JD07_class_scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the cents: ");

        int cents = input.nextInt();

        int dollar = cents / 100 ;
        cents = cents - (dollar *100);
        System.out.println(cents + " cents is equal to " + dollar + " dollars and "+ cents + "cents"  );

        input.close();


    }


/*
8. Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
convert the given cents to dollars. Include any remainder in the result.

        Example:
             Enter the cents:
             Input: 225

        Output:
             225 cents is equal to 2 dollars and 25 cents

 */

}
