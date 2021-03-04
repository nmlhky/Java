package interview_question;

import java.util.ArrayList;

public class IsPolindromPossible {
    public static void main(String[] args) {
        String s = "velel";
        System.out.println(isPolindromPossible(s));
    }

    public static String isPolindromPossible (String str){
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (list1.contains(str.charAt(i))) list2.add(str.charAt(i));
            else list1.add(str.charAt(i));
        }

        if (Math.abs(list1.size()-list2.size())>1) return "no";

        String result = "";
        String ch = "";


        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) result += list1.get(i);
            else ch += list1.get(i);
        }

        return result+ch + new StringBuilder(result).reverse().toString();
    }
}
