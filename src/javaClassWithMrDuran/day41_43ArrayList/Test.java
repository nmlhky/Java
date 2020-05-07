package javaClassWithMrDuran.day41_43ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java", "is", "super", "fun"));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9,10));

        System.out.println(isIdentical(list1,list3));

    }

    public static boolean isIdentical(ArrayList<Integer> list1 , ArrayList<Integer> list2){

        if (list1.size() != list2.size())return false;
        boolean result = true;

        for (int i = 0; i < list2.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                result = false;
            }
        }

        return result;
    }
}
