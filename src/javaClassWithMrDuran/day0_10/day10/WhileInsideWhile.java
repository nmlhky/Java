package javaClassWithMrDuran.day0_10.day10;

public class WhileInsideWhile {
    public static void main(String[] args) {

        int i = 1, j ,letter= 65;

        while (i < 6) {
            System.out.print(i + "\t");
                j=1;
            while (j<6) {
                System.out.print((char)letter + "\t");
                letter++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
