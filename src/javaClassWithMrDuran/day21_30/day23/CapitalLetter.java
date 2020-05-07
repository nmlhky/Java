package javaClassWithMrDuran.day21_30.day23;

public class CapitalLetter {
    public static void main(String[] args) {
        String a = "asd";
        capitalLetterNumber(a);
    }

    public static void capitalLetterNumber(String sentence){
        int count = 0 ;

        for (int i = 0 ; i<sentence.length() ; i++){
            if (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z')
                count++;
        }

        if (count > 4){
            System.out.println("Accepts");
        } else {
            System.out.println("Reject");
        }

    }
}
