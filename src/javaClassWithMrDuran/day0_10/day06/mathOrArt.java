package javaClassWithMrDuran.day0_10.day06;
import java.util.Scanner;
public class mathOrArt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("math or art");
        String answer = scanner.nextLine();

        if (answer.equals("math")){
            System.out.println("tutor ? y/n ");
            String tutor = scanner.nextLine();

            if (tutor.equals("y")){
                System.out.println("ok");
            }
            if (tutor.equals("n")){
                System.out.println("study your self");
            }

        } else if(answer.equals("art")){
            System.out.println("nice Choice");
        }

    }
}