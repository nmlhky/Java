import java.util.Locale;

public class Bakkt {
    public static void main(String[] args) {

        System.out.println(deleteVowels2("Apples"));
    }

    public static String deleteVowels2(String s){
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (!isVowel(s.toLowerCase().charAt(i)))
                result += s.charAt(i);
        }

        return result;
    }

    public static String deleteVowels(String s){

        return s.replaceAll("[aeiou]", "");

    }

    public static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c== 'u' ;
    }
}
