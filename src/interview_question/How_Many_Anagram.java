package interview_question;

import java.util.HashMap;

public class How_Many_Anagram {
    public static void main(String[] args) {
        int[] a = {25, 35, 872, 228, 53, 278, 872};
        System.out.println(howMany(a));

    }



    public static int howMany(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length-1; i++)
            for (int j = i+1; j < arr.length; j++)
                if (areAnagrams(arr[i],arr[j])) count++;

        return count;
    }

    public static boolean areAnagrams(int a, int b){
        if (String.valueOf(a).length() != String.valueOf(b).length()) return false;

        HashMap<Integer,Integer> map = new HashMap<>();

        while (a>0){
            int n = a%10;
            if (map.containsKey(n)) map.put(n, ((int) map.get(n)) + 1);
            else map.put(n, 1);
            a /=10;
        }

        System.out.println(map);

        while (b>0){
            int n = b%10;
            if (map.containsKey(n) && map.get(n) >0) map.put(n, ((int) map.get(n)) - 1);
            else return false;
            b /=10;
        }

        System.out.println(map);


        return true;
    }





}
