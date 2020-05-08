package questionsAnswers.dailyGroupTask;

import javaClassWithMrDuran.day31Methods.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task007 {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3};


    }

    public static boolean isPalindromePossible(String str) {
        System.out.println(isPalindromePossible("rearcac"));
        return (str.length() - str.codePoints().distinct().count() )*2 < str.length();
    }


}
