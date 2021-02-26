package questionsAnswers.interview_question;

import java.util.ArrayList;
import java.util.List;

public class Push_zero_to_end {
    public static void main(String[] args) {
        int[] arr = pushZeroToEnd(new int[]{5,0,7,6}, 4) ;

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] pushZeroToEnd(int[] arr, int n){
        List<Integer>  list = new ArrayList();

        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                list.add(arr[i]);


        for (int i = list.size(); i < arr.length; i++) {
            list.add(0);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
