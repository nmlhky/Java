package questionsAnswers.LearnNewThing;

public class StrinbldrPolindrome {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("abcdcba");

        String str = sb.toString();
        String rev = sb.reverse().toString();

        if(str.equals(rev)){
            System.out.println("polindrone");
        }else{
            System.out.println("not");
        }


    }
}
