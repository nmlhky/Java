package questionsAnswers;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4};
        System.out.println(isShorted(arr));
    }

    public static boolean isShorted(int[] arr){
        boolean result = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]){
                result = false;
            }
        }
        return result;
    }

}
