package day2;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int edge1 = keyboard.nextInt();

        int edge2 = keyboard.nextInt();

        int edge3 = keyboard.nextInt();

        System.out.print("triangle perimeter = ");
        System.out.println(edge1 + edge2 + edge3);

    }
}
