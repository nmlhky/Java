package javaClassWithMrDuran.day21_30.day25;

import java.util.ArrayList;
import java.util.List;

public class listTest {
    public static void main(String[] args) {
        // Creating a list
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0, 1); // adds 1 at 0 index
        l1.add(1, 2); // adds 2 at 1 index
        l1.add(3);
        l1.remove(2);
        l1.get(1);
        System.out.println(l1); // [1, 2]

        System.out.println(l1.get(1));

        l1.add(0,4);

        System.out.println(l1);
    }
}
