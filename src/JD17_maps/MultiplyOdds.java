package JD17_maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MultiplyOdds {
    public static void main(String[] args) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('a', 1);
        map.putIfAbsent('b', 2);
        map.putIfAbsent('c', 3);
        map.put('d', 4);
        map.putIfAbsent('e', 5);

        System.out.println(map);

        Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Character, Integer> each = it.next();

            if (each.getValue() % 2 == 1) {
                map.put(each.getKey(), each.getValue() * 2);
            }

        }
        System.out.println(map);


    }

}

/*
1. Create a class named MultiplyOdds and write a program that takes a map with characters as keys
and integers as values. The program will iterate through the map and, for each entry where the value
is an odd number, it will multiply this value by two.

         Example:
               map = {'a'=1, 'b'=2, 'c'=3, 'd'=4, 'e'=5}

         Output:
            {'a'=2, 'b'=2, 'c'=6, 'd'=4, 'e'=10}

 */