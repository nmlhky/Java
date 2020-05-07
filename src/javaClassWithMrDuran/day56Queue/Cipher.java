package javaClassWithMrDuran.day56Queue;

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
        int k;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                result += " ";
                continue;
            }

            k = q.poll();

            if (Character.isUpperCase(c) )  result += (char)( ( (c -65-k)%26)+65 ) ;
            else if (Character.isLowerCase(c) )  result += (char)( ( (c -19-k)%26)+97 ) ;
            else result += c;
            q.add(k);
        }

        return result;
    }
}
