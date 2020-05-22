package questionsAnswers.dailyGroupTask;

public class Task012 {
    public static void main(String[] args) {
        System.out.println(emptySq(10));
    }

    public static int emptySq(int step) {
        int n = 0;
        for (int i = 1; i < step; i++) {
            n += i*2;
        }
        return n*4;
    }

    public static int equal(int a, int b, int c) {

        if (a == b && b == c) {
            return 3;
        }
        return a == b || a == c || b == c ? 2 : 0;

    }
}
