package questionsAnswers.dailyGroupTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Task010 {
    public static void main(String[] args) {
        System.out.println(swapTwo("abcdefghi"));
    }

    public static String swapTwo(String str) {
        String swapping = "";

        for (int i = 0; i < str.length() - 3; i += 4) { // i = 0 4 8 12
            swapping += str.charAt(i+2);
            swapping += str.charAt(i+3);
            swapping += str.charAt(i);
            swapping += str.charAt(i+1);
        }
        System.out.println(swapping);

        for (int i = swapping.length(); i < str.length(); i++) {
            swapping += str.charAt(i);
        }

        return swapping;
    }



    public static String reverse(String str) {
        ArrayList<Character> letters = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) letters.add(str.charAt(i));
        }

        Collections.reverse(letters);
        Iterator iterator = letters.iterator();

        String reversed = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)))  reversed += iterator.next();
            else if (Character.isDigit(str.charAt(i)))  reversed += str.charAt(i);
        }

        return reversed;
    }



}
