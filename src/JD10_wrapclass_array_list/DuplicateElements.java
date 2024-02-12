package JD10_wrapclass_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class DuplicateElements {
    public static void main(String[] args) {

        //step 1
        int [] list1 = {1,2,3,4,5};         //

        System.out.println(Arrays.toString(list1));     //ArrayList

        //step2

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list2.addAll(list2);          //duplicate
        System.out.println(list2);


    }
    /*
    3. Create a class called DuplicateElements and write a program with the following specifications:
   3.1 Given an ArrayList, duplicate each element in the list.

		 	Example:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];

     */
}
