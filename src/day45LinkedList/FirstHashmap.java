package day45LinkedList;

import java.util.HashMap;

public class FirstHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> citys = new HashMap<>();

        citys.put("Los Angeles",85 );
        citys.put("Chicago",30);
        citys.put("Denver",55);
        citys.put("Orlando",90);

        System.out.println(citys);

        int sum = 0;

        for (int tem : citys.values()) {
            sum += tem;
        }

        System.out.println(sum/citys.size());
    }
}
