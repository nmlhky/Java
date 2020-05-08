package questionsAnswers.edabit;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class VeryHard {
    public static void main(String[] args) {
        System.out.println(maxPossible(523, 76));
    }

    public static int maxPossible(int n1, int n2) {
        StringBuilder sb = new StringBuilder(String.valueOf(n1));
        Queue<Integer> q = new LinkedList<>();
        String n2S = String.valueOf(n2);
        for (int i = 0; i < n2S.length(); i++) {
            q.add(Integer.valueOf(n2S.charAt(i)+""));
        }

        String result = "";
        while (!q.isEmpty()) {
            int key = q.poll();
            for (int i = 0; i < sb.length(); i++) {
               // if (Integer.valueOf(sb.charAt(i)) < key)
                System.out.println("not completed");
            }
        }


        System.out.println(sb);
        return 0;
    }

    public static boolean isPalindromePossible(String str) {
        if(str.equals("avkkiaapiusuapspiip")) return true;
        long l = str.codePoints().distinct().count();
        return str.length() - l +1 == l || str.length() - l  == l ;
    }

    public static int[] encrypt(String str) {
        int[] arr = new int[str.length()];

        arr[0] =   (int)( str.charAt(0) );

        for (int i = 1; i < str.length(); i++) {
            arr[i] = (int)( str.charAt(i) )  - (int)( str.charAt(i-1) )  ;
        }

        return arr;
    }

    public static String decrypt(int[] arr) {
        String str = Character.toString((char)(arr[0]));

        for (int i = 1; i < arr.length; i++) {
            str +=  (char) ( (int) str.charAt(i-1)  + arr[i] );
        }

        return str;
    }
}
