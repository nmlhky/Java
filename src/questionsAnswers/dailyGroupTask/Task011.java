package questionsAnswers.dailyGroupTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task011 {
    public static void main(String[] args) {
        System.out.println(removeLastVowel("Those who dare to fail miserably can achieve greatly."));
    }

    public static String uncensor2(String str, String vowels) {
        if (vowels == "") return str;
        char[] arr = vowels.toCharArray();
        List<Character> list = new ArrayList<>();

        for (char c : arr) {
            list.add(c);
        }

        Iterator iterator = list.iterator();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') result += iterator.next();
            else result += str.charAt(i);
        }

        return result;
    }

    public static String uncensor(String str, String vowels) {
        for (char c : vowels.toCharArray()) {
            str = str.replaceFirst("\\*",Character.toString(c));
        }
        return str;
    }

    public static String removeLastVowel(String str) {
        return str.replaceAll("\\b(\\w*)(?i)[aeiou](?=\\w*\\b)", "$1");
    }

    public static String removeLastVowel2(String str) {
        String result = "";
        for (String s : str.split(" ")) {
             result += removeLastVowelEachWord(s) +" ";
        }
        return result.substring(0,result.length()-1);
    }
    static String removeLastVowelEachWord(String s){
        StringBuilder sb = new StringBuilder(s);
        for (int i = sb.length()-1; i >= 0 ; i--) {
            if (isVowel(sb.charAt(i))) {
                return sb.deleteCharAt(i).toString();
            }
        }
        return sb.toString();
    }

    static boolean isVowel(char c){
        String s = String.valueOf(c).toLowerCase();
        return s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u") ;
    }
}
