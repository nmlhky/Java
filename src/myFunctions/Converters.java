package myFunctions;

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

        List<Integer> list2 = Arrays.asList(12,9,13,4,9,2,4,12,15);

        //int list to array
        int[] arr = list.stream().mapToInt(i -> i).toArray();

        //reverse order
        list.sort(Collections.reverseOrder());


    }
}
