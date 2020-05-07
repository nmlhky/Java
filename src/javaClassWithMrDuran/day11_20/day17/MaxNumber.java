package javaClassWithMrDuran.day11_20.day17;

public class MaxNumber {
    public static void main(String[] args) {
        int x[] = {1, 5, 6, 2, 8, 3, 1, 4, 10, 15, 1, 3, 6};

        int max = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }

        System.out.println(max);
    }
}
