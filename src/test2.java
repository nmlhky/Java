import java.util.*;


public class test2 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        strings.stream().filter(string -> !string.isEmpty()).forEach(System.out::println);


    }
}
