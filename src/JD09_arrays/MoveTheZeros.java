package JD09_arrays;

import java.util.Arrays;

public class MoveTheZeros {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};

        int[] array2 = new int[array.length];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array2[j] = array[i];
                j++;

            }

        }
        System.out.println(Arrays.toString(array2));

    }


}

    /*
    9. Create a class named MoveTheZeros and write a program that can move all the zeros to the end of the array.

			Example:
				array = {10, 0, 5, 0, 1, 0};

			Output:
				{10, 5, 1, 0, 0, 0};
     */

