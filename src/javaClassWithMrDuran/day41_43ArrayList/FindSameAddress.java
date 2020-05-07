package javaClassWithMrDuran.day41_43ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindSameAddress {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,6,11,2,9));

        System.out.println(findSamedif(list));


    }

    public static ArrayList<Integer> findSamedif (ArrayList<Integer> list){

        ArrayList<Integer>  list2 = new ArrayList<>();

        for (int i = 0; i < list.size()-1 ; i++) {
            for (int j = i+1 ; j < list.size()-1; j++) {
                list2.add (list.get(i) - list.get(j) );
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            list2.set(i,Math.abs(list2.get(i)));
        }

        ArrayList<Integer>  dub = new ArrayList<>();

        for (int i = 0; i < list2.size(); i++) {
            for (int j = i+1; j < list2.size(); j++) {
                if (list2.get(i).equals(list2.get(j))){
                    if (!dub.contains(list2.get(i)))  dub.add(list2.get(i));
                }
            }
        }


        return dub;

    }

}