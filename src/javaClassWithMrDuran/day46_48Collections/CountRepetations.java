package javaClassWithMrDuran.day46_48Collections;

import java.util.HashMap;

public class CountRepetations {
    public static void main(String[] args) {
        String input = "12341234123456";

        System.out.println(findFrequences(input));
    }

    public static HashMap<String,Integer> findFrequences(String str){
        HashMap<String ,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length()-2; i++) {

            String temp = str.substring(i,i+3) ;

            if(map.containsKey(temp)){
                map.put(temp, ( map.get(temp)+1 ) );
            }
            else {
                map.put(temp, 1);
            }
        }

        return map;
    }
}
