package questionsAnswers.dailyGroupTask;

import java.util.Arrays;

public class Task013 {
    public static void main(String[] args) {
        int[][] arr = squarePatch(0);
        for (int[] ar : arr) {
            System.out.println(Arrays.toString(ar));
        }
    }
    public static int[][] squarePatch(int n) {

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = n;
            }
        }
        return arr;
    }
}
