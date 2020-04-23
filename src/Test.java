import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(removeDups(new  int[] {0,0,2,2,1,0})));
        //System.out.println(capLast("java is super fun"));
        //System.out.println(sevenBoom(new int[]{19, 5, 2, 42, 2, 77}));

        System.out.println(elasticize("kayak"));

    }

    public static String elasticize(String word) {
        String result = "";
        int count = 0;
        int i = 0;



            while (count < word.length()) {
                for (int j = 0; j < i +1 ; j++) {
                    result += word.charAt(count);
                }
                if (count < word.length() / 2-1) i++;
                else if ( count > word.length()/2-1)i--;
                count++;
            }


        return result;
    }

    public static String sevenBoom(int[] arr) {

        for (int i : arr) {
            if (i == 7) return "Boom!";
            while(i > 0){
                if (i % 10 == 7) return  "Boom!";
                i = i/10 ;
            }
        }

        return "there is no 7 in the array";
    }

    public static double divide(long a, long b) {
        return (double) a/b;
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) return true;
        return false;
    }


    public static int[] removeDups(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int n : nums) {
            if (!list.contains(n)) list.add(n);
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static String[] removeDups(String[] str) {
        ArrayList<String> list = new ArrayList<>();

        for (String s : str) {
            if (!list.contains(s)) list.add(s);
        }

        String[] result = new String[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static String capLast(String str) {
        String s = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i+1)== ' ')  s += Character.toUpperCase(str.charAt(i));
            else s += str.charAt(i);
        }

        s += Character.toUpperCase(str.charAt(s.length()));

        return s;
    }

    public static int sumTwoSmallestNums(int[] arr) {
        ArrayList<Integer> list  = new ArrayList<>();

        for (int n : arr) {
            if (n>0) list.add(n);
        }
        Collections.sort(list);

        return list.get(0)+list.get(1);
    }

    public static int sumTwoSmallestNums2(int[] arr) {
        int sum = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0)continue;
            sum = arr[i] +arr[i+1];
            break;
        }

        return sum;
    }
}
