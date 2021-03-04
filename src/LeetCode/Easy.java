package LeetCode;

public class Easy {
    public static void main(String[] args) {
        System.out.println(isPalindrome(15351));
    }

    public static boolean isPalindrome(int x) {
        return ("" + x).equals(new StringBuffer("" + x).reverse().toString());
    }


    public static int reverse(int x) {

        long y = 0;

        while(x != 0){
            y = (y * 10) + x % 10;
            x /= 10;
        }

        return (y < Integer.MIN_VALUE || y > Integer.MAX_VALUE) ? 0 : (int)y;
    }


}
