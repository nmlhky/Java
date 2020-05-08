package javaClassWithMrDuran.day56Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Cipher {
    public static void main(String[] args) {
        System.out.println(decipher("novanjghl mu urxlv","317425"));
        System.out.println(cipher("knowledge is power","317425"));
        System.out.println(decipher(cipher("Apple orange1 45 34 Pineapple","2863"),"2863"));
    }

    public static String decipher(String sentence, String key){
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < key.length(); i++) {
            q.add(Integer.parseInt(key.charAt(i)+""));
        }

        String result ="";
        int k;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
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

    public static String cipher(String sentence, String key){
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < key.length(); i++) {
            q.add(Integer.parseInt(key.charAt(i)+""));
        }

        String result ="";
        int k;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == ' ') {
                result += " ";
                continue;
            }

            k = q.poll();

            if (Character.isUpperCase(c) )  result += (char)( ( (c -65+k)%26)+65 ) ;
            else if (Character.isLowerCase(c) )  result += (char)( ( (c -19+k)%26)+97 ) ;
            else result += c;
            q.add(k);
        }

        return result;
    }
}
