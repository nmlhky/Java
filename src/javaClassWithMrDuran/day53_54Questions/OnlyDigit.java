package javaClassWithMrDuran.day53_54Questions;

public class OnlyDigit {
    public static void main(String[] args) {
        String str = "42354353c4";
        System.out.println(digit(str));
        System.out.println(isEnd("melih","lih4"));
    }
    public static boolean digit(String s){
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }

    public static boolean isEnd (String s,String end){
        return s.substring(s.length() - end.length()).equals(end);
    }
}