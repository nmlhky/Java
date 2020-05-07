package javaClassWithMrDuran.day56Queue;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Cipher {
    public static void main(String[] args) {
        System.out.println(cipher("novanjghl mu urxlv","317425"));
    }
    public static String cipher(String s, String n){
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n.length(); i++) {
            q.add(Integer.parseInt(n.charAt(i)+""));
        }

        String result ="";
        int value;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                result += " ";
                continue;
            }

            value = q.poll();
            result +=  (char)(s.codePointAt(i) - value );
//            System.out.println(s.codePointAt(i));
//            System.out.println(value);
//            System.out.println(s.codePointAt(i) + value);
            q.add(value);
        }


        return result;
    }
}
