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

    public static int solution(String s) {

        List<Character> list = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        char[] arr = "BALLOON".toCharArray();
        boolean isHas = true;
        int count = 0;

        while (isHas) {
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
