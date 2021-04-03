import java.util.*;
import java.util.stream.IntStream;

public class HW7 {

    public static void main(String[] args) {
        // Q1
//        System.out.println(bestValue(7, new int[] {}, new int[] {})); // 0
//        System.out.println(bestValue(7, new int[] {4}, new int[] {1})); // 4
//        System.out.println(bestValue(7, new int[] {4, 10, 2, 4}, new int[] {3, 1, 5, 2})); // 24
//        System.out.println(bestValue(7, new int[] {4, 10, 2, 4}, new int[] {3, 3, 5, 2})); // 25
        System.out.println(bestValue(13, new int[] {4, 10, 2, 4}, new int[] {3, 5, 5, 2})); // 35
    }

    public static int bestValue(int W, int[] counts, int[] values) {
        if (counts.length < 1) return 0;

        TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < counts.length; i++) {
            if(map.containsKey(values[i]))  map.put(values[i] , map.get(values[i]) + counts[i] );
            else map.put(values[i],counts[i]);
        }

        int result = 0;

        for (int i = 0; i < W; i++) {
            if (map.get(map.firstKey()) == 0 ) map.pollFirstEntry();
            result += map.firstKey();
            map.replace(map.firstKey(), map.get(map.firstKey()) -1 );
        }


//        for (int j : arr) {
//            if (map.containsKey(j)) map.put(j, ((int) map.get(j)) + 1);
//            else map.put(j, 1);
//        }


//        // Create Metal Bars array and fill it
//        MetalBar[] metalBars = new MetalBar[counts.length];
//        for (int i = 0; i < counts.length; i++) {
//            metalBars[i] = new MetalBar(values[i],counts[i]);
//        }
//
//        //print
//        for (int i = 0; i < counts.length; i++) {
//            System.out.println(metalBars[i]);
//        }
//
//        //sort
//        for (int i = 0; i < counts.length-1; i++) {
//            while (metalBars[i].compareTo(metalBars[i+1]) == 1 ? true : false ) {
//                MetalBar temp = metalBars[i];
//                metalBars[i] = metalBars[i+1];
//                metalBars[i+1] = temp;
//            }
//        }
//
//
//        System.out.println("-------");
//
//        for (int i = 0; i < counts.length; i++) {
//            System.out.println(metalBars[i]);
//        }
//
////        System.out.println(metalBars[0].compareTo(metalBars[1]));
////
////        Arrays.sort(metalBars, new Comparator<Integer>() {
////            public int compare(Integer o1, Integer o2) {
////                // Intentional: Reverse order for this demo
////                return o2.compareTo(o1);
////            }
////
////            System.metalBars2(ArrayUtils.toPrimitive(sorted), 0, data, 0, sorted.length);
//
////        metalBars =  Arrays.stream(metalBars).
////                boxed().
////                sorted((a, b) -> b.compareTo(a)). // sort descending
////                mapToInt(i -> i).
////                toArray();

        return result;
    }
}
