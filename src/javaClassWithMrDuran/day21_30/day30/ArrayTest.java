package javaClassWithMrDuran.day21_30.day30;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr = {1, 23, 4, 5, 6, 7};

        StatArray myArr = new StatArray(arr);

        System.out.println(myArr.IndexOfIntArray(arr,myArr.MaxValue()));
    }
}