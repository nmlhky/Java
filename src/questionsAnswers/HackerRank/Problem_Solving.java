package questionsAnswers.HackerRank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Problem_Solving {

    public static void main(String[] args) {

        miniMaxSum(new int[]{1,2,3,4,5});
    }


    //https://www.hackerrank.com/challenges/mini-max-sum/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
    static void miniMaxSum(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            sum += arr[i];
        }

        Collections.sort(list);
        System.out.println( (sum - list.get(list.size()-1)) + " " + (sum - list.get(0)));

    }


    //https://www.hackerrank.com/challenges/staircase/problem?h_r=next-challenge&h_v=zen
    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }
            for (int j = n-i-1; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

    //https://www.hackerrank.com/challenges/plus-minus/problem
    static void plusMinus(int[] arr) {
        float p =0 , n=0 ,z=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) p++;
            else if(arr[i]<0) n++;
            else z++;
        }

        float size = arr.length;

        System.out.format("%.6f\n", (p/size));
        System.out.format("%.6f\n", (n/size));
        System.out.format("%.6f\n",z/size);

    }


    //https://www.hackerrank.com/challenges/diagonal-difference/problem
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i).get(i) - arr.get(i).get(arr.size()-1-i);
        }

        return Math.abs(sum);
    }
}
