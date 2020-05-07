package javaClassWithMrDuran.day11_20.day16;

public class SumArray {
    public static void main(String[] args) {

        int[] number = {1, 2, 345, 5, 6745, 345, 345};

        int total = 0;

        for (int i : number) {
            total += i;
        }

        System.out.println(total);
    }
}