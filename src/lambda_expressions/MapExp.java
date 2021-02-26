package questionsAnswers.lambda_expressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExp {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream().map(x -> x*x).forEach(x-> System.out.println(x));
        System.out.println(list);
        List<Integer> list2 =  list.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(list2);

    }
}
