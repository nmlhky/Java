package HackerRank;

import java.util.Scanner;

public class Sorting_BubbleSort {
    static void countSwaps(int[] a) {

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length-1; j++) {
                if (a[i]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[i];
                    a[i] = temp;
                    count++;
                }
            }
        }

        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }

}
