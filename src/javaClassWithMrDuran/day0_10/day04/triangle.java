package javaClassWithMrDuran.day0_10.day04;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner edges = new Scanner(System.in);
        int a = edges.nextInt();
        int b = edges.nextInt();
        int c = edges.nextInt();

        if (a+b>c & a+c>b & b+c>a){
            System.out.println("okay");
        }
        else {
            System.out.println("not okay");
        }

    }
}
