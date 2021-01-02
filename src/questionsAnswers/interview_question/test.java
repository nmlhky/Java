package questionsAnswers.interview_question;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {

    }

    public static int countTinyPairs(int[] a, int[] b, int k) {
        int element1 = a[0];
        int element2 = b[0];
        for (int i = 0; i < a.length; i++) {
            if (element1 > a[i]) {
                element1 = a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (element2 > b[i]) {
                element2 = b[i];
            }
        }
        k = (Arrays.stream(a).min().getAsInt()) +
                Arrays.stream(b).min().getAsInt();
        return k;
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

