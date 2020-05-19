package questionsAnswers.lambda_expressions;

import java.util.Arrays;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);

        list.forEach(x -> System.out.println(x));

        System.out.println("----------------");

        list.forEach(x -> {
            x += 3;
            System.out.println(x);
        });
    }
}
