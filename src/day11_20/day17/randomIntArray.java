package day11_20.day17;

public class randomIntArray {
    public static void main(String[] args) {
        RandomArray(5);
    }

    public static void RandomArray(int n) {
        int[] random = new int[n];
        for (int i = 0; i < n; i++) {
            random[i] = (int) (Math.random() * 4001) + 1000;
        }

        for (int j = 0; j < n; j++) {
            System.out.println(random[j]);
        }

    }
}
