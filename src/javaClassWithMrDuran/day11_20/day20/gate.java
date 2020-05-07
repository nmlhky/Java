package javaClassWithMrDuran.day11_20.day20;

import java.util.Scanner;

public class gate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        destination = destination.toLowerCase();

        switch(destination) {
            case "europe":
                System.out.println("gate a");
                break;
            case "africa":
                System.out.println("gate b");
                break;
            case "asia":
                System.out.println("gate c");
                break;
            case "america":
                System.out.println("gate d");
                break;
            default:
                System.out.println("not a destination");
        }
    }
}
