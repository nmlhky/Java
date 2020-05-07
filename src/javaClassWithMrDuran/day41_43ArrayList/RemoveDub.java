package javaClassWithMrDuran.day41_43ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class RemoveDub {
    public static void main(String[] args) {

        //first way
        ArrayList<Integer> arr = new ArrayList<>( Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5, 1,1,1,1,1,1,1,1));

        Collections.sort(arr);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == arr.get(i - 1)) {
                arr.remove(i);
                arr.remove(i+1);
            }else if (arr.get(i) == arr.get(i + 1)) {
                arr.remove(i);
            }
        }

        System.out.println(arr);

        //second way
            ArrayList<Integer> list = new ArrayList<>( Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

            ArrayList<Integer> newList = new ArrayList<Integer>();

            for (int number:list) {
                if (!newList.contains(number)){
                    newList.add(number);
                }
            }

            System.out.println(newList);

        }

}
