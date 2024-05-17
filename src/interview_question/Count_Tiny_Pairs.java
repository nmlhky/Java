package interview_question;

import java.util.Arrays;

public class Count_Tiny_Pairs {

    public static void main(String[] args) {

    }

    public static int countTinyPairs(int[] a, int[] b) {

        int element1 = a[0];
        int element2 = b[0];
        for (int j : a) {
            if (element1 > j)
                element1 = j;

        }
        for (int j : b) {
            if (element2 > j)
                element2 = j;

        }

        return (Arrays.stream(a).min().getAsInt()) +
                Arrays.stream(b).min().getAsInt();
    }

    public static String mergeStrings(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
            if (i < s1.length())
                result.append(s1.charAt(i));
            if (i < s2.length())
                result.append(s2.charAt(i));
        }
        return result.toString();
    }
}