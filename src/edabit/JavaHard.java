package edabit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class JavaHard {
    public static void main(String[] args) {
        System.out.println(validateCard(1234567890123456L));
    }

    public static boolean validateCard(long num) {
        String str = String.valueOf(num);
        //if (!(str.length() > 13 && str.length() < 20))return false;
        int check = (int) (num % 10) ;
        num /= 10;
        long reversed = 0;

        while(num != 0) {
            long digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        for (int i = 0; i < str.length()-1; i++) {
            temp
        }

        System.out.println(reversed);
        System.out.println(check);
        return true;
    }

    public static boolean almostPalindrome(String str) {
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for (int i = 0; i < str.length()/2; i++) {
            list1.add(str.charAt(i));
            list2.add(str.charAt(  (str.length()-1)  -i ));
        }

        int dif = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) dif++;
        }

        if (dif == 1) return true;
        return false;
    }

    public static String elasticize(String word) {
        String result = "";
        int count = 0;
        int i = 0;

        if (word.length()%2==1) {
            while (count < word.length()) {
                for (int j = 0; j < i + 1; j++) {
                    result += word.charAt(count);
                }
                if (count < word.length() / 2) i++;
                else i--;
                count++;
            }
        }
        else {
            i=1;
            while (count < word.length()) {
                for (int j = 0; j < i ; j++) {
                    result += word.charAt(count);
                }
                if (count < word.length() / 2-1) i++;
                else if ( count > word.length()/2-1)i--;
                count++;
            }
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

    public static String overTime(double[] arr) {
        double daily , start = arr[0] , finish = arr[1] ,rate = arr[2] , overtime = arr[3];

        if (finish <= 17) {
            daily = (finish - start) * rate;
        }
        else {
            if (start < 17) {
                daily = (finish - 17) * rate * overtime;
                daily += (17 - start) * rate;
            }
            else{
                daily = (finish - start) * rate * overtime;
            }
        }

        return "$" + String.format ("%.2f", daily);
    }
}
