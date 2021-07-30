import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class Test {
    public static void main(String[] args) {

        System.out.println(test(new int[]{1,2,3,4,5}));
        System.out.println(test2("apple"));

    }

    public static int test(int[] array){
        return -1;
    }

    public static String test2(String s){
        return new StringBuilder(s).reverse().toString();
    }

}
