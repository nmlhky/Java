package javaClassWithMrDuran.day41_43ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Combine2list {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> myList2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<String> list = new ArrayList<>(Arrays.asList("red", "blue", "green", "red", "yellow", "green"));

        ArrayList<Integer> myList3 = combine(myList, myList2);

        System.out.println(myList3);


    }

    public String[] listToStr(ArrayList<String> list){

        String[] arr = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }



    public static ArrayList<Integer> combine(ArrayList<Integer> list1 , ArrayList<Integer> list2){

        ArrayList<Integer> combine = new ArrayList<>();

        for (int num :  list1) {
            combine.add(num);
        }
        for (int num :  list2) {
            combine.add(num);
        }

        return combine;
    }
}
