package questionsAnswers;

import java.math.BigInteger;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        BigInteger m = sc.nextBigInteger();
        BigInteger factorial = BigInteger.ONE;

        long i = 1;

        while (m.compareTo(factorial) > 0 ) {
            i++;
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(i);
    }

    static Long factorial(Long n)
    {
        if (n == 0)
            return 1L;

        return n*factorial(n-1);
    }

    public static boolean isShorted(int[] arr){
        boolean result = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]){
                result = false;
            }
        }
        return result;
    }

}
