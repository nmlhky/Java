package questionsAnswers.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathesExp {
    public static void main(String[] args) {
        String s = "my name 5 is melih kaya kaya kaya";


        // rakamla baslamiyorsa ^ baslangic  [^ degilse \\d rakam ] .* herhangi karakter
        boolean isStartNotDigit =  s.matches("^[^\\d].*")  ;


        //kaya veya aa ile bitiyorsa ? true : false
        boolean isFinishWithKaya =  s.matches(".*kaya||.*aa") ;

    }
}
