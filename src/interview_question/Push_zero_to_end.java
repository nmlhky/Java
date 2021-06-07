package interview_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Push_zero_to_end {
    public static void main(String[] args) {
        int[] arr = pushZeroToEnd(new int[]{5,0,7,6}, 4) ;

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] pushZeroToEnd(int[] arr, int n){

        int[] arr2 = new int[n];

        int index = 0;

        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr2[index++] = arr[i];

        return arr2;
    }

    public static int[] pushZeroToEnd3(int[] arr, int n){

        int index = 0;

        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[index++] = arr[i];

        while (index < n)
            arr[index++] = 0;

        return arr;
    }

    public static int[] pushZeroToEnd2(int[] arr, int n){
        ArrayList<Integer>  list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                list.add(arr[i]);


        for (int i = list.size(); i < arr.length; i++)
            list.add(0);

        return list.stream().mapToInt(i -> i).toArray();
    }
}
