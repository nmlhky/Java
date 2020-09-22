package javaClassWithMrDuran.projects;

import java.util.ArrayList;
import java.util.Collections;

public class testt {
    public static void main(String[] args) {
        System.out.println(solution("BAOOLLNNOLOLGBAX"));
    }
    public static int solution(String S) {


        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        ArrayList<Integer> arrO = new ArrayList<>();
        ArrayList<Integer> arrL = new ArrayList<>();
        ArrayList<Integer> arrN = new ArrayList<>();

        int countB=0;
        int countA=0;
        int countL=0;
        int countO=0;
        int countN=0;
        int counter=0;


        for (int i = 0; i < S.length(); i++) {

            if (S.charAt(i) == 'B') {
                int first = i;
                arrB.add(first);
                countB++;
            }
            if (S.charAt(i) == 'A') {
                int first = i;
                arrA.add(first);
                countA++;
            }
            if (S.charAt(i) == 'L') {
                int first = i;
                arrL.add(first);
                Collections.sort(arrL, Collections.reverseOrder());
                countL++;
            }
            if (S.charAt(i) == 'O') {
                int first = i;
                arrO.add(first);
                countO++;
            }
            if (S.charAt(i) == 'N') {
                int first = i;
                arrN.add(first);
                countN++;
            }
            if (arrB.size() > 0 && arrA.size() > 0 && arrL.size() >= 2 && arrO.size() >= 2 && arrN.size() > 0) {

                StringBuilder myString = new StringBuilder(S);
                myString.setCharAt(arrB.get(0), '1');
                myString.setCharAt(arrA.get(0), '2');
                myString.setCharAt(arrL.get(0), '3');
                myString.setCharAt(arrL.get(1), '4');
                myString.setCharAt(arrO.get(0), '5');
                myString.setCharAt(arrO.get(1), '6');
                myString.setCharAt(arrN.get(0), '7');
                S = myString.toString();
                S = S.replace("1", "");
                S = S.replace("2", "");
                S = S.replace("3", "");
                S = S.replace("4", "");
                S = S.replace("5", "");
                S = S.replace("6", "");
                S = S.replace("7", "");
                arrA = new ArrayList<>();
                arrB = new ArrayList<>();
                arrL = new ArrayList<>();
                arrO = new ArrayList<>();
                arrN = new ArrayList<>();
                i = 0;
                counter++;
            }

        }
        System.out.println("remained word : " + S);
        return counter;
    }

}
