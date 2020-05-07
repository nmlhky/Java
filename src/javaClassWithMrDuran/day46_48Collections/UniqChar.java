package javaClassWithMrDuran.day46_48Collections;

import java.util.HashSet;

public class UniqChar {
    public static void main(String[] args) {
        String str = "abcdec";

        boolean isUniq = true;

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))) isUniq = false;
            set.add(str.charAt(i));
        }

        System.out.println((isUniq) ? "Uniq" : "not uniq");
    }
}
