package questionsAnswers;


public class Test {

    public static void main(String[] args) {
        System.out.println(getsum(5,9,6));
    }

    static long getsum(int i, int j, int k) {

        long sum = 0;

        for (; i <= j; i++)
            sum +=i;


        for (j--; j >= k; j--)
            sum += j;


        return sum;

    }

}

