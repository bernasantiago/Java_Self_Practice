package JD16_collections;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class RemovePalindromes {


    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));


        List<String> list2 = new ArrayList<>();

        for (String each : list1) {
            if (!isPalindrome(each)) {
                list2.add(each);
            }

        }
        System.out.println(list2);


    }

    public static boolean isPalindrome(String string) {
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();

        return sb.toString().equalsIgnoreCase(string);
    }
}
/*
6. Create a class named RemovePalindromes and write a program that removes all palindrome strings from a given list of strings. The removal should be performed without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"}



 */