package questionsAnswers.edabit;

import java.util.*;

public class VeryHard {
    public static void main(String[] args) {
        System.out.println(maxPossible(523, 91255));
    }

    //Maximize the First Number
    public static int maxPossible(int n1, int n2) {
        StringBuilder sb = new StringBuilder(String.valueOf(n1));
        TreeSet<Integer> tree = new TreeSet<>(Collections.reverseOrder());

        while (n2>0){
            tree.add(n2%10);
            n2 /= 10;
        }

        System.out.println(tree);

        Iterator iterator = tree.iterator();
        int result = 0;

        while (iterator.hasNext()){
            int key = (int) iterator.next();
            for (int i = 0; i < sb.length(); i++) {
                //System.out.println(key + " " + Integer.parseInt(sb.charAt(i) ));
                if (key > Integer.valueOf(sb.charAt(i)) ) {
                    System.out.println(i);
                    sb.replace(i,i+1,String.valueOf(key));
                }
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
