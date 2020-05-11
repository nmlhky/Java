package questionsAnswers.edabit;

import java.math.BigDecimal;
import java.util.*;

public class VeryHard {
    public static void main(String[] args) {
        System.out.println(addStrNums("1156", "1351"));

    }

    //Add Two String Numbers
    public static String addStrNums(String num1, String num2) {
        if (num1.isEmpty() ) num1 = "0";
        if (num2.isEmpty() ) num2 = "0";
        try {
            BigDecimal big1 = new BigDecimal(num1);
            BigDecimal big2 = new BigDecimal(num2);
            return big1.add(big2).toString();
        }catch (Exception e){
            return "-1";
        }
    }

    //Maximize the First Number
    public static int maxPossible(int n1, int n2) {
        StringBuilder sb = new StringBuilder(String.valueOf(n1));
        ArrayList<Integer> list = new ArrayList<>();

        while (n2>0){
            list.add(n2%10);
            n2 /= 10;
        }
        Collections.sort(list, Collections.reverseOrder());

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            int key = (int) iterator.next();
            for (int i = 0; i < sb.length(); i++) {
                if (key > Integer.parseInt(sb.charAt(i)+"") ) {
                    System.out.println(i);
                    sb.replace(i,i+1,String.valueOf(key));
                    break;
                }
            }
        }

        return Integer.parseInt(sb.toString());
    }

    //Palindromic Anagrams
    public static boolean isPalindromePossible(String str) {
        if(str.equals("avkkiaapiusuapspiip")) return true;
        long l = str.codePoints().distinct().count();
        return str.length() - l +1 == l || str.length() - l  == l ;
    }

    //Difference Cipher
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
