package test;
import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        System.out.println(reverseCapitalize("hello"));
        System.out.println(reverseCapitalize2("word"));

        int[] nums = {1, 2, 3, 5, 2, 1, 0};
        System.out.println(Arrays.toString(removeDups(nums)));

        String[] str = {"red","blue","green","red", "yellow", "green" };
        System.out.println(Arrays.toString(removeDups(str)));
    }

    public static String reverseCapitalize(String str) {
        String str2 = "";

        for (int i = 0; i < str.length() ; i++) {
            str2 += str.charAt(  (str.length()-1)  -i  ) ;
        }

        str2 = str2.toUpperCase();

        return str2;
    }

    public static String reverseCapitalize2(String str) {

        StringBuilder strbul = new StringBuilder(str);

        String rev = strbul.reverse().toString().toUpperCase();

        return rev;
    }

    public static int[] removeDups(int[] nums) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) list.add(nums[i]);
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

    public static String[] removeDups(String[] str) {

        ArrayList<String> aListColors = new ArrayList<String>();

        for (int i = 0; i < str.length; i++) {
            if (!aListColors.contains(str[i])) {
                aListColors.add(str[i]);
            }
        }

        str = aListColors.toArray(new String[aListColors.size()]);

        return str;
    }
}
