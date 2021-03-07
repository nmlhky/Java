package codility;

import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Pattern;

public class Count_Square {
    public static void main(String[] args) {
        System.out.println(solution(1,25));
    }

    public static int solution(int A, int B) {

        int count = 0;

        for (int i = A; i <= B; i++) {
            if (Math.sqrt(i) == (int) Math.sqrt(i))
                count++;
        }

        return count;
    }
}
