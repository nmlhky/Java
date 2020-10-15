package questionsAnswers.interview_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Balloon {
    public static void main(String[] args) {
        //BALLOON
        String str = "BALLOONBALsdadasdsaadsadasdsadsasadsadasasdLOONBALLOONasdsadaa";
        System. out. println(solution(str));

    }

    public static int solution(String s) { // ## Author Melih Kaya ##

        List<Character> list = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList()); // create list from s`s each char

        char[] arr = "BALLOON".toCharArray(); // create char array from balloon`s char
        boolean isHas = true;
        int count = 0;

        while (isHas) { //chekc list has b,a,l,l,o,o,n  if has loop countinued and count++
            for (int i = 0; i < arr .length; i++) {
                if (list. contains(arr[i])) {
                    list. remove((Character) arr[i]);
                } else {
                    isHas = false;
                    break;
                }
            }
            if (isHas) count++;
        }
        return count;

    }

}
