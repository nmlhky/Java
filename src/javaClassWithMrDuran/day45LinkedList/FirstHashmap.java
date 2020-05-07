package javaClassWithMrDuran.day45LinkedList;

import java.util.HashMap;

public class FirstHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> cities = new HashMap<>();

        cities.put("Los Angeles",85 );
        cities.put("Chicago",30);
        cities.put("Denver",55);
        cities.put("Orlando",90);

        System.out.println(cities);

        int sum = 0;

        for (int tem : cities.values()) {
            sum += tem;
        }


        System.out.println(sum/cities.size());
    }
}
