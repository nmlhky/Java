package javaClassWithMrDuran.day0_10.day06;
import java.util.Scanner;
public class Clothes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Asking size
        System.out.println("Size (L / M / S) : ");
        String size = scan.next();
        //Asking membership
        System.out.println("Membership (Y / N) : ");
        String membership = scan.next();

        if (membership.equals("Y")) {
            if (size.equals("S")) {
                System.out.println("$9.99");
            } else if (size.equals("M")) {
                System.out.println("$10.99");
            } else if (size.equals("L")) {
                System.out.println("$11.99");
            } else {
                System.out.println("Only S / M / L");
            }
        } else {System.out.println("You need a membership");}



    }
}
