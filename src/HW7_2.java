import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.TreeMap;

public class HW7_2 {

    public static void main(String[] args) {
        // Q1
        System.out.println(bestValue(7, new int[] {}, new int[] {})); // 0
        System.out.println(bestValue(7, new int[] {4}, new int[] {1})); // 4
        System.out.println(bestValue(7, new int[] {4, 10, 2, 4}, new int[] {3, 1, 5, 2})); // 24
        System.out.println(bestValue(7, new int[] {4, 10, 2, 4}, new int[] {3, 3, 5, 2})); // 25
        System.out.println(bestValue(7, new int[] {4, 10, 2, 4}, new int[] {3, 5, 5, 2})); // 35
    }

    public static int bestValue(int W, int[] counts, int[] values) {
        if (counts.length < 1) return 0;


        // Create Metal Bars array and fill it
        MetalBar[] mBars = new MetalBar[counts.length];
        for (int i = 0; i < counts.length; i++) {
            mBars[i] = new MetalBar(values[i],counts[i]);
        }

        //sort
        Arrays.sort(mBars);

        //result
        int result = 0;

        for(int i = 0; i < counts.length; i++) {
            if (mBars[i].getCount() >= W) {
                result += mBars[i].getValue() * W;
                return result;
            } else {
                result += mBars[i].getValue() * mBars[i].getCount();
                W -= mBars[i].getCount();
            }
        }

        return result;
    }
}
