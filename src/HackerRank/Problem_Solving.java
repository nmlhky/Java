package HackerRank;

import javax.swing.*;
import javax.xml.stream.events.Characters;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem_Solving {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        System.out.println(kangaroo(43,2,70,2));

    }

    //Number Line Jumps https://www.hackerrank.com/challenges/kangaroo/problem
    static String kangaroo(int x1, int v1, int x2, int v2) {

        if (v1==v2 && x1!=x2) return "NO";

        return ((x1-x2) % (v1-v2) == 0 ) && ((x2 - x1) * (v2 - v1) < 0) ? "YES" : "NO";

    }

    //biggerIsGreater https://www.hackerrank.com/challenges/bigger-is-greater/problem
    static String biggerIsGreater(String w) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < w.length(); i++) {
            list.add(Integer.valueOf(w.charAt(i)));
        }

        boolean noAnswer = true;

        for (int i = list.size()-2; i >=0 ; i--) {
            if (list.get(i)<list.get(i+1)) {
                noAnswer = false;
                int temp = list.get(i);
                int min = 1000;
                for (int j = list.size()-1; j > i; j--) {
                    if (list.get(j) < min && list.get(j) > temp)
                        min = list.get(j);
                }

                int j = list.lastIndexOf(min);
                list.set(i,min);
                list.set(j,temp);
                Collections.sort(list.subList(i+1,list.size()));
                break;
            }
        }

        if (noAnswer) return "no answer";

        StringBuilder result = new StringBuilder();

        for (Integer i: list) {
            result.append((char) i.intValue());
        }

        return result.toString();

    }

    //countApplesAndOranges https://www.hackerrank.com/challenges/apple-and-orange/problem
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        System.out.println(Arrays.stream(apples).filter(x-> x+a >=s && x+a <=t ).count());
        System.out.println(Arrays.stream(oranges).filter(x-> x+b >=s && x+b <=t ).count());

    }


    //https://www.hackerrank.com/challenges/time-conversion/problem?h_r=next-challenge&h_v=zen
    static String timeConversion(String s) {
        List<String> chars = Stream.of(s.split(":")).map(String::new).collect(Collectors.toList());
        System.out.println(chars);
        System.out.println(chars.get(8));

        return "ok";
    }



    //https://www.hackerrank.com/challenges/compare-the-triplets/problem
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> point =  Arrays.asList(0, 0);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) point.set(0,point.get(0) + 1);
            else if (a.get(i) < b.get(i)) point.set(1,point.get(1) + 1);
        }
        return point;

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
        candles.sort(Collections.reverseOrder());

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

        for (int j : arr) {
            if (j > 0) p++;
            else if (j < 0) n++;
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
