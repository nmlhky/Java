package javaClassWithMrDuran.day55Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] numbers = {5,4,3,1,8};
        System.out.println(Arrays.toString(bubleShort(numbers)));

    }
    public static int[] bubleShort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]){
                    arr[j-1] = arr[j-1]+arr[j];
                    arr[j] = arr[j-1]-arr[j];
                    arr[j-1] = arr[j-1]-arr[j];
                }
            }
        }
        return arr;
    }
}
