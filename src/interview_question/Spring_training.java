package interview_question;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class Spring_training {
    public static void main(String[] args) {
        System.out.println(spring_traing(new int[]{2,4,1,3}));
        System.out.println("-----------------");
        System.out.println(spring_traing(new int[]{1,5,10,3}));
        System.out.println("-----------------");
        System.out.println(spring_traing(new int[]{1,5}));
        System.out.println("-----------------");
        System.out.println(spring_traing(new int[]{9,7,3,1}));
    }

    public static int spring_traing(int[] arr){

        TreeMap<Integer, Integer> list = new TreeMap<>();

        for (int i = 0; i < arr.length-1; i++)
            if (arr[i] > arr[i+1])
                for (int j = arr[i]; j >= arr[i+1] ; j--)
                    list.put(j, (list.get(j) == null ? 0 : list.get(j) ) + 1  );
            else
                for (int j = arr[i]; j <= arr[i+1]; j++)
                    list.put(j, (list.get(j) == null ? 0 : list.get(j) ) + 1  );


        Iterator iter = list.keySet().iterator();
        int max = 0;

        while (iter.hasNext()){
            int k = list.get(iter.next()) ;
            max = Math.max(k, max);
        }

        for (int entry: list.keySet())
            if (list.get(entry) == max) return entry;

        return -1;

    }
}
