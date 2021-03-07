package codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class Arrays_test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(new int[]{3,8,9,7,6},3)));
        System.out.println(solution(new int[]{3,3,9,9,6}));
    }

    public static int[] solution2(int[] A, int K) {
        // write your code in Java SE 11

        int[] result = new int[A.length];

        int index = A.length-K;

        for (int i = 0; i < A.length; i++,index++) {
            result[i] = A[index];
            if (index==A.length-1) index = -1;
        }

        return result;
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (!set1.add(A[i])) set2.add(A[i]);
        }

        System.out.println(set1);
        System.out.println(set2);

        for (int i: set1) {
            if (!set2.contains(i)) return i;
        }

        return -1;

    }


}
