package questionsAnswers.interview_question;

import java.util.Arrays;

public class FindLargestValue {
    public static void main(String[] args) {
        int[] arr={12,13,15,9};
        System.out.println(largestValue(arr));
    }

    public static int largestValue2(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int largestValue(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
}
