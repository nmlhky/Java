package edabit;

import java.util.ArrayList;
import java.util.Collections;

public class Expert {
    public static void main(String[] args) {
        String s = "###*@";
        System.out.println(pilish_string(s));
    }

    public static String pilish_string(String s) {
        long piLong = 3141592653589793238L;
        ArrayList<Integer> pi = new ArrayList<>();

        while (piLong > 0){
            pi.add( (int) (piLong%10 )  );
            piLong /= 10;
        }
        Collections.reverse(pi);

        ArrayList<String> piStringList = new ArrayList<>();
        String temp;
        int index = 0;
        for (int i = 0; i < pi.size(); i++) {
            temp = "";

            for (int j = 0; j < pi.get(i) ; j++) {

                temp += s.charAt(index);

                if (index < s.length()-1)  index++;

            }

            piStringList.add(temp);
            if (index == s.length()) break;
            if (index == s.length() -1  ) ;
        }

        String result = piStringList.get(0);

        for (int i = 1; i < piStringList.size(); i++) {
            result += " ";
            result += piStringList.get(i);
        }

        return result;
    }
}
