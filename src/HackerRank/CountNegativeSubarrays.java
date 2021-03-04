package HackerRank;

import java.util.Scanner;

public class CountNegativeSubarrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int count = 0;

        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int k = j; k < n; k++) {
                sum += arr[k];
                if (sum < 0){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
