package Homework;
import java.util.Arrays;

public class ArrayPrintWithForLoop {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Get the String representation of array
        //String stringArr = Arrays.toString(arr);

        // print the String representation
        //System.out.println("Array: " + stringArr);

        for (int i=0; i<10;i++){
            System.out.println(arr[i]);
        }
    }
}
