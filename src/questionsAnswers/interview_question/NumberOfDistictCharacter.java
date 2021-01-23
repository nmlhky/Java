package questionsAnswers.interview_question;

public class NumberOfDistictCharacter {
    public static void main(String[] args) {
        System.out.println(numberOfDistictCharacter("my name is granar",'a'));
    }

    public static int numberOfDistictCharacter(String s, char c){
        int start = 0, end = s.length() ;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                start = i;
                break;
            }
        }

        return start;




    }
}
