package LearnNewThing;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String str = "Hey Parents, Surprise, Fruit Juice Is Not Fruit";

        // nokta, virgulu .. silme
        str.replaceAll("\\p{Punct}", ""); //Hey Parents Surprise Fruit Juice Is Not Fruit



        String s = "my name 5 is melih kaya kaya kaya";

        // rakamla baslamiyorsa ^ baslangic  [^ degilse \\d rakam ] .* herhangi karakter
        boolean isStartNotDigit =  s.matches("^[^\\d].*")  ;


        //kaya veya aa ile bitiyorsa ? true : false
        boolean isFinishWithKaya =  s.matches(".*kaya|.*aa") ;


        String st = "java regex test string";

        int  result = Pattern.compile(".*[a].*").matcher(st).groupCount();
        System.out.println(result);
    }
}
