package javaClassWithMrDuran.day0_10.day07;
import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = 0;

        for ( ; num < num2 ; ) {
            num2 = scanner.nextInt();
        }

        for (int i = num; i < num2+1 ; i++) {
            if (i%5==0) {
                System.out.println(i);
            }
        }
    }
}
