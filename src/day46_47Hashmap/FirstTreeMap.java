package day46_47Hashmap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeMap;

public class FirstTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tree = new TreeMap<>();

        tree.put("Vahit",100);
        tree.put("Shohrat",100);
        tree.put("Rumeyse",100);
        tree.put("Melih",100);
        tree.put("Ali",100);

//        System.out.println(tree);
//
//        for (Integer i : tree.keySet()) {
//            if ( i>7 ) table.remove(i);
//        }

        Iterator<String> iterator = tree.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " = " + tree.get(iterator.next()));
        }
//
//        System.out.println(table);
    }
}