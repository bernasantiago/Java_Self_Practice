package JD17_maps;

import java.util.*;

public class InvertMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");

        System.out.println(map);

        Map<String, Integer> invertMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            invertMap.put(entry.getValue(), entry.getKey());
            
        }
        System.out.println(invertMap);





    }



    }

/*
2. Create a class named InvertMap and write a program that returns a new map which is the
inverted version of the provided map, meaning the keys become values and the values become keys.
It is assumed that there are no duplicate values in the original map.

         Example:
               map = {1="a", 2="b", 3="c"}

         Output:
               {"a"=1, "b"=2, "c"=3}
 */