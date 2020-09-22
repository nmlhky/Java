package javaClassWithMrDuran.projects;

import java.util.ArrayList;

public class interview_question {
    public static void main(String[] args) {
        // B A LL OO N
        System.out.println(solution("BALLOON"));
    }

    public static int solution(String s){
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        System.out.println(list);

        return 1;
    }
}
