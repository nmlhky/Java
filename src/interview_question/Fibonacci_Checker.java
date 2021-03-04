package interview_question;

public class Fibonacci_Checker {
    public static void main(String[] args) {
        System.out.println(FibonacciChecker(34));

        System.out.println(fib(9));
    }


    public static String FibonacciChecker(int num) {

        int sum = 0, a = 1, b = 1;
        if (num == 0 || num == 1)  return "yes";

        while (sum < num) {
            sum = a + b;
            b = a;
            a = sum;
        }

        if (sum == num) return "yes";

        return "no";

    }

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }



}