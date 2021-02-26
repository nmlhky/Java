package questionsAnswers.interview_question;

import java.util.Arrays;

public class Balagrams {
    public static void main(String[] args) {
        System.out.println(checkBlagrams("tangram","anagram"));
        System.out.println(checkBlagrams("aba","bab"));
        System.out.println(checkBlagrams("silent","listen"));
        System.out.println(checkBlagrams("Keep","Peek"));
        checkBlagrams("Keep", "Peek");
    }

    static boolean checkBlagrams(String word1, String word2) { //like anagram but 1 letter different
        char[] characters = word1.toCharArray();
        StringBuilder sbSecond = new StringBuilder(word2);

        for(char ch : characters){
            int index = sbSecond.indexOf("" + ch);
            if(index != -1){
                sbSecond.deleteCharAt(index);
            }else{
                continue;
            }
        }

        return sbSecond.length()==1 ? true : false;
    }


}
