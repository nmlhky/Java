package javaClassWithMrDuran.interviewQuestions;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrone("abccba"));
        boolean b= true;
        if (b=false){
            System.out.println("aa");
        }else {
            System.out.println("else");
        }
    }

    public static boolean isPalindrone(String s){
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
}
