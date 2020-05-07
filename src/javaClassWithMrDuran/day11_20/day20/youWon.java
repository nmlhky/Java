package javaClassWithMrDuran.day11_20.day20;


import java.util.Scanner;

public class youWon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        do {

            input  = scanner.nextLine();
            if (input.equals("you won")) break;
            System.out.println("you said "+ input);

        } while (!input.equalsIgnoreCase("you won") );

        System.out.println("i knew i will win");

        scanner.close();
    }
}
