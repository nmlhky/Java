package questionsAnswers.LearnNewThing;

public class IsPolindrome {

    public static void main(String[] args) {
        System.out.println(is_palindrome(545));
        System.out.println(is_palindrome("racecar"));
    }

    public static Boolean is_palindrome(int a){
        return  Integer.toString(a).equals( new StringBuilder(Integer.toString(a)).reverse().toString() );
    }

    public static Boolean is_palindrome(String a){
        return  a.equals( new StringBuilder(a).reverse().toString() );
    }

}
