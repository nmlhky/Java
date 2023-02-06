package myFunctions;

import java.util.*;
import java.util.stream.Collectors;

public class MyMethods {
    public static void main(String[] args) {

    }

    //apple orange apple banana pear banana  --> [orange, banana, apple, pear]
    public static String  removeDublicate(String s){
        return new HashSet<>(Arrays.asList(s.split(" "))).toString();
    }

    public static void RemoveIF_list(String[] args) {
        String[] arr = {"hi","how","are","you"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        if (list.removeIf( s -> s.equals("are"))){
            System.out.println( "removed");
        }
        System.out.println(list);
    }

    public static void ReverseTwoInt(String[] args) {
        int a = 10;
        int b = 5;

        a = a+b;
        b = a-b;
        a = a-b;
    }

    public static void PrintDiffirentNumber(String[] args) {
        System.out.println(5^5^6); // 6
        System.out.println(5^6^5); // 6

    }

    //12345 --> 54321
    public static int reverseInt(int num){
        int reverse = 0;

        while (num > 0){
            reverse *= 10 ;
            reverse += num %10;
            num /=10;
        }
        return reverse;
    }

    public static Boolean is_palindrome(int a){
        return  Integer.toString(a).equals( new StringBuilder(Integer.toString(a)).reverse().toString() );
    }

    public static Boolean is_palindrome(String a){
        return  a.equals( new StringBuilder(a).reverse().toString() );
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) ;
    }

    public static int[] removeDups(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int[] result = new int[set.size()];
        int idx = 0;

        for (int i : set) {
            result[idx++] = i;
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

    // input 1 2 5 18 22 65 return true;
    public static boolean isOrdered(String str){
        String[] myStrArray = str.substring(0,str.length()-2).split(" ");
        if (myStrArray.length <= 2 ) return true;

        boolean asc = true;
        boolean desc = true;

        // Check ascending
        for (int i = 0; i < myStrArray.length-1; i++) {
            if (!(Integer.parseInt(myStrArray[i]) >= Integer.parseInt(myStrArray[i + 1]))) {
                asc = false;
                break;
            }
        }
        // Check descending
        for (int i = 0; i < myStrArray.length-1; i++) {
            if (!(Integer.parseInt(myStrArray[i]) <= Integer.parseInt(myStrArray[i + 1]))){
                desc = false;
                break;
            }
        }
        return  asc || desc;
    }
}

