package javaClassWithMrDuran.day53_54Questions;

public class Hippo {
    public static void main(String[] args) {
        System.out.println(check("hippo","x1"));
    }
    public static String check(String str, String word){
        return (str.substring( 1,word.length()) .equals(word.substring(1)) ) ? str.substring(0,word.length()) : "";
    }


}
