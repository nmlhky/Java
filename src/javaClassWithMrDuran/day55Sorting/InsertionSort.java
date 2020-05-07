package javaClassWithMrDuran.day55Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {5,4,3,1,8};
        System.out.println(Arrays.toString(bubleShort(numbers)));

    }
    public static int[] bubleShort(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j > 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

}
