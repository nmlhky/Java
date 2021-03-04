package HackerRank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class DequeExp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> hs = new HashSet();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            hs.add(num);

            if (deque.size()==m){
                if (hs.size() > max) max = hs.size();
                int first = (int) deque.remove();
                if (!deque.contains(first)) hs.remove(first);
            }
        }

        System.out.println(max);

    }
}
