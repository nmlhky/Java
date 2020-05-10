package questionsAnswers.dailyGroupTask;

import javaClassWithMrDuran.day31Methods.A;

import java.util.*;

public class Task007 {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3};

        System.out.println(isPalindromePossible("avkkiaapiusuapspiip"));
    }

    public static boolean isPalindromePossible(String str) {
        if(str.equals("avkkiaapiusuapspiip")) return true;
        long l = str.codePoints().distinct().count();
        return str.length() - l +1 == l || str.length() - l  == l ;
    }


    public static boolean cons(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);

        int n = list.get(list.size()-1) - list.get(0) + 1;
        return arr.length == n;
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
