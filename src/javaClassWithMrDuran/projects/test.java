package javaClassWithMrDuran.projects;

import java.util.*;

public class test {
    public static void main(String[] args) {
        // B A N LL OO
        System.out.println(solution("BAOOLLNNOLOLGBAX"));
    }

    public static int solution(String s) {

        int counterA = 0;
        int counterB = 0;
        int counterO = 0;
        int counterL = 0;
        int counterN = 0;
        int counter = 0;


        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        ArrayList<Integer> arrO = new ArrayList<>();
        ArrayList<Integer> arrL = new ArrayList<>();
        ArrayList<Integer> arrN = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B') {
                arrB.add(i);
                counterB++;
            }
            if (s.charAt(i) == 'A') {
                arrA.add(i);
                counterA++;
            }
            if (s.charAt(i) == 'L') {
                arrL.add(i);
                counterL++;
            }
            if (s.charAt(i) == 'O') {
                arrO.add(i);
                counterO++;
            }
            if (s.charAt(i) == 'N') {
                arrN.add(i);
                counterN++;
            }



            if (arrB.size() > 0 && arrA.size() > 0 && arrL.size() > 1 && arrO.size() > 1 && arrN.size() > 0) {
                StringBuilder myString = new StringBuilder(s);
                myString.setCharAt(arrB.get(0), '1');
                myString.setCharAt(arrA.get(0), '2');
                myString.setCharAt(arrL.get(0), '3');
                myString.setCharAt(arrL.get(1), '4');
                myString.setCharAt(arrO.get(0), '5');
                myString.setCharAt(arrO.get(1), '6');
                myString.setCharAt(arrN.get(0), '7');
                s = myString.toString();
                s = s.replace("1", "");
                s = s.replace("2", "");
                s = s.replace("3", "");
                s = s.replace("4", "");
                s = s.replace("5", "");
                s = s.replace("6", "");
                s = s.replace("7", "");
                arrA = new ArrayList<>();
                arrB = new ArrayList<>();
                arrL = new ArrayList<>();
                arrO = new ArrayList<>();
                arrN = new ArrayList<>();
                counter++;
                i = 0;
            }
        }

        return counter;
    }
}
