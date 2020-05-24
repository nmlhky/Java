package questionsAnswers;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4));

        // write your code here
        queue.offer(5);

        queue.poll();
        queue.poll();

        System.out.println(queue);


//        String n1 = "Rekha";
//        String n2 = "Rekha";
//        String n3 = new String("Rekha");
//
//        System.out.println(n1.equals(n2));
//        System.out.println(n1 == n2);
//
//        System.out.println(n1.equals(n3));
//        System.out.println(n1 == n3);
    }

}
