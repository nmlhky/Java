package javaClassWithMrDuran.day53_54Questions;

public class Password {
    public static void main(String[] args) {

    }

    public static int pas(int n, String password){
        int count =0;

        if(!password.matches(".*[A-Z].*")) count++;
        if(!password.matches(".*[a-z].*")) count++;
        if(!password.matches(".*[0-9].*")) count++;
        if(!password.matches(".*\\p{Punct}.*")) count++;

        return Math.max(count,6-n);
    }
}
