package regex;

import java.util.regex.Pattern;

public class PatternCompile {
    public static void main(String[] args) {
        String s = "java regex test string";

        int  result = Pattern.compile(".*[a].*").matcher(s).groupCount();
        System.out.println(result);
    }
}
