package interview_question;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Count_Array_Element {
    public static void main(String[] args) {

        System.out.println(count_array_element(new int[]{1,2,2,3,3,4,2}));

    }

    public static TreeMap count_array_element (int[] arr){

        TreeMap map = new TreeMap<Integer, Integer>();

        for (int j : arr) {
            if (map.containsKey(j)) map.put(j, ((int) map.get(j)) + 1);
            else map.put(j, 1);
        }

        return map;

    }


}
