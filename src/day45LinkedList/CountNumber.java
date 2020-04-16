package day45LinkedList;

import java.util.HashMap;

public class CountNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,5,1,5,4,2,2};

        HashMap<Integer,Integer> numbers = new HashMap<>();

        for (int i : arr) {
            try {
                numbers.put(i,numbers.get(i)+1);
            }
            catch (Exception e) {
                numbers.put(i, 1);
            }
        }

        System.out.println(numbers);
    }
}
