import java.util.*;


public class test2 {
    public static void main(String[] args) {

        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        long count = strings.stream().filter(string -> string.isEmpty()).count();

        System.out.println(count);
    }
}
