package javaClassWithMrDuran.day0_10.day09;

public class ForForLoop {
    public static void main(String[] args) {

        for (int i = 0 ; i<50 ; ) {
            for (int j = 0; j < 4; j++) {
                i += 2;
                if (i==14) continue;
                System.out.print( i  + "\t");

            }
            System.out.println();
        }
    }
}