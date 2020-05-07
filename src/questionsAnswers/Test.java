package questionsAnswers;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String s = "What an easy task, right";

        System.out.println(new ArrayList<String>(Arrays.asList(s.split(" "))).size());


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2,3,4,6,3,1));
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            list3.add( list1.get(i) * list2.get(i)  );
        }

        System.out.println(list3);


        System.out.println(elasticize("hello"));
        //System.out.println(Arrays.toString(removeDups(new  int[] {0,0,2,2,1,0})));
        //System.out.println(capLast("java is super fun"));
        //System.out.println(sevenBoom(new int[]{19, 5, 2, 42, 2, 77}));

        System.out.println(hashSet("java is java"));

    }

    public static String  hashSet(String s){
        return new HashSet<>(Arrays.asList(s.split(" "))).toString();
    }

    public static int reverseInt(int num){
        //int num = 12345;
        int reverse = 0;

        while (num > 0){
            reverse *= 10 ;
            reverse += num %10;
            num /=10;
        }
        return reverse; //54321
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
