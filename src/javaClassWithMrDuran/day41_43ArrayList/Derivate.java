package javaClassWithMrDuran.day41_43ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Derivate {
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>(Arrays.asList(8,5,4,2,9));

        FindDerivate(list);

    }

    public static int FindDerivate (ArrayList<Integer> list){

        ArrayList<Integer>  derivate = new ArrayList<>();

        for (int i = 0; i < list.size() - 1; i++) {
            derivate.add(list.get(i) - list.get(i+1) );

        }

        int max = 0;
        for (int i : derivate  ) {
            if (Math.abs(i)>i) max = Math.abs(i);
        }

        return max;

    }

}
