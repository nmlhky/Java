package javaClassWithMrDuran.day11_20.day15;

public class RandomNumber {
    public static void main(String[] args) {
        for (int j= 0 ; j <100 ; j++) {
            for (int i = 0; i < 6; i++) {
                System.out.print((int) (Math.random() * 10));
            }
            System.out.println();
        }
    }
}
