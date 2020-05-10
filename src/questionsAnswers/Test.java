package questionsAnswers;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(noYelling("I just!!! can!!! not!!! believe!!! it!!!"));

    }

    public static String noYelling(String str) {
//        str.replaceAll("~((?<!:)[^\p{L}\p{N}])\1+~u" , )
//        $str = preg_replace('~((?<!:)[^\p{L}\p{N}])\1+~u', '$1', $str);
        return str;
    }

    public static String sevenBoom(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i]; // n = 6574;
            while (n > 0) {
                System.out.println("before "+n);
                System.out.println("n % 10 = " + n%10);
                if (n % 10 == 7) return "Boom!";
                n = n / 10;
                System.out.println("after "+n);
                System.out.println();
            }
        }
        return "there is no 7 in the array";
    }

    public static boolean isPalindromePossible(String str) {
        long l = str.codePoints().distinct().count();
        return (str.length() - l + 1 == l || str.length() - l == l) ;
    }

    public static boolean isPalindromePossible2(String str) {
        HashSet<Character> results = new HashSet<>();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (set.add(ch))
                results.add(ch);
            else
                results.remove(ch);
        }
        return results.size() < 2;
    }
}
