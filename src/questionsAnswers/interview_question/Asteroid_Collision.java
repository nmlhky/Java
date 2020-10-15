package questionsAnswers.interview_question;

import java.util.*;
import java.util.stream.Collectors;

public class Asteroid_Collision {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(asteroidCollision(new int[]{5,10,-5})));
    }

    public static int[] asteroidCollision(int[] arr){

        List<Integer> result = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {

            int n = arr[i];
            boolean b = true;

            if (n>0) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] < 0 && Math.abs( arr[j] ) >=  n  ) {
                        b = false;
                        break;
                    }
                }
            }


            if (n<0){
                for (int j = i; j >= 0; j--) {
                    if (arr[j] > 0 && arr[j] >= Math.abs(n) ) {
                        b = false;
                        break;
                    }
                }
            }


            if (b) result.add(n);
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}
