package javaClassWithMrDuran.day39_40TryCatch;

import java.util.Scanner;

public class NextLetter {
    public static void main(String[] args) {

        //System.out.println(nextLetter());

        String word = "";

        try{
            word = word.replaceAll("abc","bcd");
        }
        catch (Exception e) {
            System.out.println("aa");
        }

        System.out.println(word);

        }

    public static String nextLetter(){
        Scanner scan = new Scanner(System.in);
        String letter = scan.nextLine();

        String result = "";

        for (int i = 0; i < letter.length(); i++) {
           char a= letter.charAt(i) ;
            a++;
            result +=a;
        }

        try {
            return result;
        }catch (Exception e){
            return "error";
        }

    }
}
