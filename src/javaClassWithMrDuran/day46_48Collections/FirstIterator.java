package javaClassWithMrDuran.day46_48Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class FirstIterator {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (i%2 !=0) digits.add(i);
        }

        Iterator<Integer> iterator = digits.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
