package javaClassWithMrDuran.day46_48Collections;

import java.util.HashMap;

public class votes {
    public static void main(String[] args) {
        String[] votes ={"joe" , "joe" , "alex" , "joe" , "alex" , "sue"};
        System.out.println(elections(votes));
    }

    public static String elections(String[] str){
        HashMap<String ,Integer> map = new HashMap<>();

        for (String s : str) {
            if (map.containsKey(s)) map.put(s, (map.get(s) + 1));
            else map.put(s,1);
        }

        int max = 0;
        String winner = "";

        for (String st : map.keySet()) {
            if ( map.get(st) > max) {
                max = map.get(st);
                winner = st;
            }
        }

        return winner;
    }
}
