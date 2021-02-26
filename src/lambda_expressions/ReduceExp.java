package questionsAnswers.lambda_expressions;

import java.util.Arrays;
import java.util.List;

public class ReduceExp {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        int sum = list.stream().reduce((x,y) -> x+y).get();

        System.out.println(sum);
    }
}
