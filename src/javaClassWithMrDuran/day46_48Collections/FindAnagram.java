package javaClassWithMrDuran.day46_48Collections;

import java.util.HashMap;

public class FindAnagram {
    public static void main(String[] args) {
        String[] arr = {"cat","cta" , "car" , "care"};
        findAnagram(arr);
    }

    public static void findAnagram(String[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i==j)continue;
                if (anagram(arr[i]).equals(anagram(arr[j]))) System.out.println(arr[i]);
            }
        }
    }

    public static HashMap<Character,Integer> anagram(String str){
        HashMap<Character ,Integer> chars = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            try {
                chars.put(str.charAt(i), chars.get(str.charAt(i)) + 1);
            }
            catch (Exception e) {
                chars.put(str.charAt(i), 1);
            }
        }
        return chars;
    }
}
