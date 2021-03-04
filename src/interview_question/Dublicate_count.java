package interview_question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Dublicate_count {
//    public static void main(String[] args) {
//        String [] allNames={"John Tom","John Mary","John Tom","Mary Ana", "Mary Ana"};
//        String a[]={"100000","id aee", "he fjd","ei ijh","ha ehh","ei cia","ah cjg","da iad","ch haj","de gaj","eh hje","gf gih","ei fig","jj deb","fa dga","ig jba","ac ggg","cc fgb","ef gjd","ej baa"};
//        count(allNames);
//    }
//
//    public static void count(String[] arr){
//        HashMap<String,Integer> map = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i],  map.get(arr[i]) + 1  ) ;
//            }
//            else {
//                map.put(arr[i] , 1);
//            }
//        }
//
//        for (int i : map.values()) {
//            System.out.println(i);
//        }
//
//
//        String [] pair_left = new String[t];
//        String [] pair_right = new String[t];
//
//        String[] arr = new String[pair_left.length];
//
//        for (int i = 0; i < pair_left.length; i++) {
//            arr[i] = pair_left + " " + pair_right;
//        }
//
//    }

    public static void main(String[] args) {
        {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            String [] pair_left = new String[t];
            String [] pair_right = new String[t];

            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
            }

//Write your code here

            HashSet<String> set = new HashSet<>();

            for (int i = 0; i < t; i++) {
                set.add(pair_left[i]+" "+pair_right[i]);
                System.out.println(set.size());
            }

        }
    }
}
