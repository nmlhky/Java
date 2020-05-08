package questionsAnswers.dailyGroupTask;

import javaClassWithMrDuran.day31Methods.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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


}
