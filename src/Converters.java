import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Converters {
    public static void main(String[] args) {

        //string to char list
        String s = "apple";
        List<Character> chars = s.chars().mapToObj(x -> (char) x).collect(Collectors.toList());

        //int array to list
        int[] array = { 4, 4,4};
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        //int list to array
        int[] arr = list.stream().mapToInt(i -> i).toArray();

        //reverse order
        list.sort(Collections.reverseOrder());


    }
}
