package questionsAnswers.interview_question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class Min_numbers_from_2_dim_array {
    public static void main(String[] args) {
        int[] arr = min_numbers(new int[][]{{17,14,7},{13,54,42},{19,8,6}});

        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("---");
        System.out.println(min_numbers2(new int[][]{{17,14,7},{13,54,42},{19,8,6}}));
    }

    //cevap sizin istedigniz gibi {7,13,6}
    public static int[] min_numbers(int[][] arr){
        int[] a = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            a[i] = Arrays.stream(arr[i]).min().getAsInt();;
        }

        return a;
    }

    // bu fonsiyon butun rakamlara bakip en kucugunu cikti veriyor.
    // sizin verdiginiz ornekler icin 6
    public static int min_numbers2(int[][] data){

        return Arrays.stream(data).flatMapToInt(Arrays::stream).min().getAsInt();

    }
}
