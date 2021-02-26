package questionsAnswers.interview_question;

import java.util.HashSet;

public class Not_repeat_number {
    public static void main(String[] args) {
        int[] a = {4,2,3,4,2,1};
        System.out.println(notRepeatNumber(a));
    }

    public static int notRepeatNumber(int[] arr){

        HashSet<Integer> set = new HashSet<Integer>();  // 4 2 3
        HashSet<Integer> setDub = new HashSet<Integer>(); // 4 , 2

        for (int i:arr)
            if(!set.add(i)) setDub.add(i);

        for (int i : arr) {
            if (!setDub.contains(i)) return i;
        }

//        for (int i = 0; i < arr.length; i++) {
//            if (setDub.contains(arr[i])) return i+". eleman = "+arr[i];
//        }

        return -1;
    }


}
