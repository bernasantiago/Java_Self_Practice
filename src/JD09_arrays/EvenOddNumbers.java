package JD09_arrays;

import java.util.Arrays;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        int evenNum = 0;
        int oddNum = 0;

        for (int i : array) {
            if (i % 2 == 0) {
                evenNum++;

            } else {
                oddNum++;

            }

        }
        System.out.println("The array has " + oddNum + " odd number and " + evenNum + " even numbers.");
    }

    /*

    Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.

     */
}
