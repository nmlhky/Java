package questionsAnswers.HackerRank;

import java.util.*;

public class FilledOrders {

    public static void main(String[] args) {
        System.out.println(filledOrders(new ArrayList<>(Arrays.asList(10,30)),40 ));
    }

    public static int filledOrders(List<Integer> order, int k) {
        // Write your code here
        Collections.sort(order);

        int result = 0;

        Iterator<Integer> iter = order.iterator();
        while (iter.hasNext()){
            int n = iter.next().intValue();
            if ( n <= k ){
                result++;
                k -= n;
            }
        }

        return result;
    }


}
