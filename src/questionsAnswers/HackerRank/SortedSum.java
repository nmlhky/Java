package questionsAnswers.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedSum {
    public static void main(String[] args) {
        System.out.println(sortedSum(Arrays.asList(9,5,8)));
    }

    public static long sortedSum(List<Integer> a) {
        // Write your code here

        long sum = 0;

        for (int i = 0; i < a.size(); i++) {

            int[] arr = new int[i+1];

            for (int j = 0; j <= i; j++)
                arr[j] = a.get(j);

            Arrays.sort(arr);

            for (int j = 0; j <= i; j++ )
                sum += (j+1) * arr[j];

        }

        return sum;

    }
}
