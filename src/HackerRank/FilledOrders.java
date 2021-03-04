package HackerRank;

import java.util.*;

public class FilledOrders {

    public static void main(String[] args) {
        System.out.println(filledOrders(new ArrayList<>(Arrays.asList(10,30)),40 ));
    }

    public static int filledOrders(List<Integer> order, int k) {
        // Write your code here
        Collections.sort(order);

        int result = 0;

        for (Integer n : order) {
            if (n <= k) {
                result++;
                k -= n;
            }
        }


        return result;
    }


}
