package day23;

public class CapitalLetter {
    public static void main(String[] args) {

    }

    public static int capitalLetterNumber(String sentence){

        int count = 0 ;

        for (int i = 0 ; i<sentence.length() ; i++){
            if (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z')
                count++;
        }

        return count;
    }
}
