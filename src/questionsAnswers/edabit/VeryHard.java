package questionsAnswers.edabit;

import java.util.Arrays;

public class VeryHard {
    public static void main(String[] args) {
        //System.out.println(decrypt(  encrypt("Hi there!") ));
    }

    public static int[] encrypt(String str) {
        int[] arr = new int[str.length()];

        arr[0] =   (int)( str.charAt(0) );

        for (int i = 1; i < str.length(); i++) {
            arr[i] = (int)( str.charAt(i) )  - (int)( str.charAt(i-1) )  ;
        }

        return arr;
    }

    public static String decrypt(int[] arr) {
        String str = Character.toString((char)(arr[0]));

        for (int i = 1; i < arr.length; i++) {
            str +=  (char) ( (int) str.charAt(i-1)  + arr[i] );
        }

        return str;
    }
}
