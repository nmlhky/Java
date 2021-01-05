package questionsAnswers.interview_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class minUniqueSum {
    public static void main(String[] args) {
        int[] array = { 4, ,4};
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        System.out.println(minUniqueSum(list));
    }

    public static int minUniqueSum(List<Integer> arr) {

        Collections.sort(arr);

        int sum = 0;

        ArrayList < Integer > arrayList = new ArrayList< Integer >(arr.size());

        arrayList.add(arr.get(0));

        for (int i = 1; i < arr.size(); i++) {

            int val = arr.get(i);

            while (arrayList.contains(val)) {

                val++;
            }

            arrayList.add(val);

        }



        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }

        return sum;
    }
}


