package javaClassWithMrDuran.day46_48Collections;

import java.util.HashMap;

public class MaxMultiplicationValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,2,4};

        maxMultivalue(arr);
    }
    public static void maxMultivalue(int[] arr){

        HashMap<Integer,Integer> multiplication = new HashMap<>();

        for (int i = 0; i < arr.length-1; i++) {
            multiplication.put(i,arr[i]*arr[i+1]);
        }

        int max = 0, index =0 ;
        for (int key : multiplication.keySet() ){
            if (multiplication.get(key) > max) {
                max = multiplication.get(key);
                index = key;
            }
        }

        System.out.println("index " + index + " value " + arr[index] );
        System.out.println("index " + (index +1 ) + " value " + arr[index+1] );
        System.out.println("max multip." + max);
    }


}
