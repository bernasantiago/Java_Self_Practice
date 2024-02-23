package JD16_collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";

        Set<Character> set1 = new TreeSet<>();
        for ( char each : str1.toCharArray()) {
            set1.add(each);

        }

        Set<Character> set2 = new TreeSet<>();
        for ( char each : str2.toCharArray()) {
            set2.add(each);

        }
        boolean result = set1.equals(set2);
        System.out.println(result);



    }
}

/*
5. Create a class named Anagram and write a program that checks if two strings are anagrams of each other, considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false
 */