package edabit;

import java.util.ArrayList;
import java.util.Collections;

public class Expert {
    public static void main(String[] args) {
        System.out.println(hexLattice(37));
    }

    public static String hexLattice(int n) {
        if (n==1) return " o ";
        ArrayList<Integer> check = new ArrayList<>();
        int temp = 1;
        int i = 0;
        while (temp < n) {
            temp += i * 6;
            check.add(temp);
            i++;
        }
        if (!check.contains(n)) return "Invalid";

        String hex = "";
        StringBuilder half = new StringBuilder();
        int size = 1 + check.indexOf(n);
        int line = 1;

        for (int j = 0; j < size; j++) {

            //first space
            for (int k = line; k <= size; k++) {
                hex += " ";
            }
            // o
            for (int k = 1; k < size+line; k++) {
                hex += "o ";
            }

            //last space
            for (int k = line; k < size; k++) {
                hex += " ";
            }
            if (j==size-2) half.append(hex);
            hex += "\n";
            line++;
        }
        half.reverse();
        hex += half;

        return hex;
    }


    public static String abacabaPattern(int n) {
        char[] c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        String s = "";
        String temp ;

        for (int i = 0; i < n; i++) {
            temp = s;
            s += c[i];
            s += temp;
        }

        return s;
    }

    public static String pilish_string(String s) {
        if (s=="") return "";
        long piLong = 314159265358979L;
        ArrayList<Integer> pi = new ArrayList<>();

        while (piLong > 0){
            pi.add( (int) (piLong%10 )  );
            piLong /= 10;
        }
        Collections.reverse(pi);

        ArrayList<String> piStringList = new ArrayList<>();
        String temp = "";
        int index = 0;
        int count = 0;
        for (int i = 0; i < pi.size(); i++) {

            for (int j = 0; j < pi.get(i) ; j++) {

                temp += s.charAt(index);

                if (index < s.length()-1)  index++;
                count++;
            }

            piStringList.add(temp);
            temp = "";
            if (count >= s.length()) break;

        }

        String result = piStringList.get(0);

        for (int i = 1; i < piStringList.size(); i++) {
            result += " ";
            result += piStringList.get(i);
        }

        return result;
    }
}
