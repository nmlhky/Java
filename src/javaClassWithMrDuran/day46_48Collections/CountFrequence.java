package javaClassWithMrDuran.day46_48Collections;

import java.util.HashMap;

public class CountFrequence {
    public static void main(String[] args) {
        String str = "java is super fun java fun";

        System.out.println(findRepetingWords(str));
    }

    public static HashMap<Character,Integer> findFrequences(String str){
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

    public static HashMap<String,Integer> findRepetingWords(String str){
        HashMap<String ,Integer> map = new HashMap<>();
        String word = "";
        str += ' ';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {

                if(map.containsKey(word)){
                    map.put(word, ( map.get(word)+1 ) );
                }
                else {
                    map.put(word, 1);
                }
                word = "";

            }
            else {
                word += str.charAt(i);
            }
        }

        return map;
    }


}
