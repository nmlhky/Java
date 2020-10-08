package questionsAnswers.HackerRank;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Problem_Solving {

    public static void main(String[] args) {

        int[] array = { 4, 4,4};

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            list2.add(9999999);
        }

        System.out.println(birthdayCakeCandles(list2));


    }


    //https://www.hackerrank.com/challenges/grading/problem
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for (int i = 0; i <grades.size() ; i++) {
            if (grades.get(i) < 40) continue;
            if (grades.get(i) % 5 > 2)  grades.set(i, grades.get(i) + (5- grades.get(i) % 5 ) ) ;
        }

        return grades;
    }


    //https://www.hackerrank.com/challenges/birthday-cake-candles/problem
    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles,Collections.reverseOrder());

        for (int i = 0; i < candles.size(); i++) {
            if (!candles.get(0).equals(candles.get(i))  )   return i;
        }
            return candles.size();
    }




    //https://www.hackerrank.com/challenges/mini-max-sum/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
    static void miniMaxSum(int[] arr) {
        long sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;



        for (int n : arr) {
            System.out.println(n);
            sum += n;
            if (n>max) max = n;
            if (n<min) min = n;

            System.out.println(sum);
            System.out.println(max);
            System.out.println(min);

            System.out.println("------------");
        }


        System.out.println( (sum - max) + " " + (sum - min));

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
