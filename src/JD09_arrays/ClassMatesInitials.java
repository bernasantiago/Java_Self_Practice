package JD09_arrays;

import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {


        String[] classmates = {"Faranak Davoodzadeh", "Jen Nest", "Pendar Shamsollahi",
                "Chiyavan Banavi", "Alexandru Alexandrov", "Gholam Parwiz", "Eren Acan", "Mehdi Messaoudi", "Konstantin Gavrilov", "Vicor Chow" };

        //reverse names first
        for (String reversed : classmates) {
            String input =reverseName(reversed);
            System.out.println(input);

        }


    }

    //model a function to be able to reverse the string of names in the main method
    private static String reverseName(String classmates) {
        return new StringBuilder(classmates).reverse().toString();
    }


}

    /*

    2. Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.

     */

