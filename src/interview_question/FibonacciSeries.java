package interview_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSeries {
    public static void main(String[] args) {
        int k = 10;
        fibPrint(k);
        System.out.println("");
        System.out.println(Arrays.toString(fib(k)));

        System.out.println("");


        for (int i = 0; i < k; i++) {
            System.out.print(fibonacciRecursion(i)+ ", ");
        }

    }

    public static int fibonacciRecursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }


    public static void fibPrint(int n){

        int n1 = 0;
        int n2 = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + ", ");
            int sum = n1+n2;
            n1 = n2;
            n2 = sum;

        }
    }
    public static int[] fib(int n){
        int[] arr = new int[n];

        if (n>0)
            arr[0] = 0;
        if (n>1)
            arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr;

    }

    public static int[] fibWithList(int n){
        List<Integer> list = new ArrayList<>();

        if (n>0)
            list.add(0);
        if (n>1)
            list.add(1);

        for (int i = 2; i < n; i++) {
            list.add(list.get(i-2)+list.get(i-1));
        }

        return list.stream().mapToInt(i -> i).toArray();
        
    }
}
