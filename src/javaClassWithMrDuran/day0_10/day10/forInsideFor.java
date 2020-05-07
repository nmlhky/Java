package javaClassWithMrDuran.day0_10.day10;

public class forInsideFor {
    public static void main(String[] args) {

        for (int m = 1; m < 10; m++) {
            for (int n = 0; n < 10 ; n++) {
                System.out.print(m);
                System.out.println(n);
            }
            System.out.println("----");
        }
    }
}
