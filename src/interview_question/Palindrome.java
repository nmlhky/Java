package interview_question;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(countPalindrone("abagdfgdgfdgfdgsgd    gdgsfdsgdgbsdfbfsdbsdbdsfgfdsgfgfdsgsgsfdgvbdsfvfffffffffgftgdrtdrab"));

    }


    public static int countPalindrone(String s){
        int count = 0;

        for (int i =0; i < s.length(); i++)
            for (int j = i+2; j <= s.length(); j++)
                if (isPalindrone2(s.substring(i,j)))
                    count++;

        return count;
    }


    public static boolean isPalindrone(String s){
        s = s.replaceAll("\\s+","").toLowerCase();
        return new StringBuffer(s).reverse().toString().equals(s);
    }


    public static boolean isPalindrone2(String s){
        s = s.replaceAll("\\s+","").toLowerCase();

        for (int i = 0; i < s.length()/2; i++)
            if (s.charAt(i) != s.charAt(s.length()-1-i)) return false;

        return true;
    }
}
