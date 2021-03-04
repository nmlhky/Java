package interview_question;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Swap_String {
    public static void main(String[] args) {
        System.out.println(swapString("google.com"));
        System.out.println(array_size_without_dub(new int[]{1,2,3,2,1}));
    }

    public static String swapString(String str){
        return str.split("\\.")[1] + "." + str.split("[.]")[0];
    }

    public static int array_size_without_dub(int[] arr){
        return  Arrays.stream(arr).boxed().collect(Collectors.toSet()).size();
    }

}
