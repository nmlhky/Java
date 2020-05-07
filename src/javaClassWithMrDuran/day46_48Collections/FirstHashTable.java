package javaClassWithMrDuran.day46_48Collections;

import java.util.Hashtable;
import java.util.Iterator;

public class FirstHashTable {
    public static void main(String[] args) {
        Hashtable<Integer , Integer> table = new Hashtable<>();

        for (int i = 0; i < 10 ; i++) {
            table.put(i , i*2  );
        }

//        for (Integer i : table.keySet()) {
//            if ( i>7 ) table.remove(i);
//        }

        Iterator<Integer> iterator = table.keySet().iterator();

        while (iterator.hasNext()){
            int key = iterator.next();
            if (key > 7 ) System.out.println(key);
        }

        System.out.println(table);
    }
}
