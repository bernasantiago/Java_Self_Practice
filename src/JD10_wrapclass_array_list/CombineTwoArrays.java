package JD10_wrapclass_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};


        ArrayList<String> input = new ArrayList<>(Arrays.asList(arr1));
        input.addAll(Arrays.asList(arr2));
        System.out.println(input);

        System.out.print("list ==> {");
        for (int i = 0; i < input.size(); i++) {

            System.out.print( "\"" + input.get(i) + "\"" );

            if (i < input.size()-1){
                System.out.print(", ");
            }

        }
        System.out.println("}");
        }






    }
    /*
    4. Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

     */

