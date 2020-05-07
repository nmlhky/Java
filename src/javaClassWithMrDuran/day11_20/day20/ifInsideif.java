package javaClassWithMrDuran.day11_20.day20;

import java.util.Scanner;

public class ifInsideif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("does the animal breathe air?");
        String breat = scanner.next();
        if (breat.contains("y")){
            System.out.println("does the animal lay eggs?");
            String leg = scanner.next();

            if (leg.contains("y")){
                System.out.println("bird");
            }else {
                System.out.println("mammal");
            }
        }else {
            System.out.println("Fish");
        }


    }
}
