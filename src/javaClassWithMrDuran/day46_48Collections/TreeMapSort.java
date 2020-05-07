package javaClassWithMrDuran.day46_48Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapSort {
    public static void main(String[] args) {
        TreeMap<Integer, String> tree = new TreeMap<>(Collections.reverseOrder());

        tree.put(2, "bb");
        tree.put(1, "aa");
        tree.put(3, "cc");

        Iterator<Integer> iterator = tree.keySet().iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + " = " + tree.get(key));
        }
    }
}
