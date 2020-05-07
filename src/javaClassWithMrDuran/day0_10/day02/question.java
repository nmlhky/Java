package javaClassWithMrDuran.day0_10.day02;
import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("rectangle length");
        int length = input.nextInt();
        System.out.println("area if rectangle :" + length *4 );

        System.out.println("---------------");

        System.out.println("circle radius");
        int radius = input.nextInt();
        System.out.println("perimeter of circle :" + radius * 3.14 * 2 );

        System.out.println("---------------");

        System.out.println("msrp ");
        int msrp = input.nextInt();

        System.out.println("down payment ");
        int down = input.nextInt();

        System.out.println("discont percentage");
        int dis = input.nextInt();


        System.out.println("monthlt payment:" + (msrp * (100 - dis) /100 -down) /12 );

    }
}
