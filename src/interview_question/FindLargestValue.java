package interview_question;

import java.util.Arrays;

public class FindLargestValue {
    public static void main(String[] args) {
        int[] arr={12,13,15,9};
        System.out.println(largestValue(arr));
    }

    public static int largestValue2(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (j > max) max = j;
        }
        return max;
    }

    public static int largestValue(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
}
