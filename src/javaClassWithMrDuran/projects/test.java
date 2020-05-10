package javaClassWithMrDuran.projects;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Map<String, int[]> prices = new HashMap<String, int[]>();
        prices.put("milk", new int[]{1, 3, 2});
        prices.put("eggs", new int[] {1, 1, 2});

        for (String key: prices.keySet()){
            System.out.print(key +" ");
            System.out.println(Arrays.toString(prices.get(key)));
        }

        //key value yazdirmak icin
//        Iterator iterator = prices.keySet().iterator();
//        while (iterator.hasNext()){
//            Object key = iterator.next();
//            System.out.print(key);
//
//            System.out.print("=");
//
//            for (int i : prices.get(key)) {
//                System.out.print(i);
//                System.out.print(",");
//            }
//
//            System.out.println();
//        }


    }
}
