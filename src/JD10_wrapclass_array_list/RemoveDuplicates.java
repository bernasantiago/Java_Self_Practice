package JD10_wrapclass_array_list;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7));

        ArrayList<Integer> list2 = new ArrayList<>();

        for (Integer element : list1) {
            if (!list2.contains(element)) {

                list2.add(element);

            }

        }
        System.out.println(list2);

    }
    /*
    8. Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]


     */
}
