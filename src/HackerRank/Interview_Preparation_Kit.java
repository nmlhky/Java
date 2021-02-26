package questionsAnswers.HackerRank;

import java.util.regex.Pattern;

public class Interview_Preparation_Kit {
    public static void main(String[] args) {
        System.out.println(repeatedString("aba",10));
    }


    //https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
    static long repeatedString(String s, long n) {

        long l = n/s.length();
        int k = (int) n%s.length();
        long count = 0;

        for(char c : s.toCharArray())
            if(c == 'a')
                count++;

        count *= l;

        for(char c : s.substring(0,k).toCharArray())
            if(c == 'a')
                count++;

        return count;

//        long matches = Pattern.compile("a").matcher(s).results().count();
//        long matches2 = Pattern.compile("a").matcher(s.substring(0,k)).results().count();
//
//        return matches*l + matches2;

    }

}
