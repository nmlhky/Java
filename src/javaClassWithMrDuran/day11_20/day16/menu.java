package javaClassWithMrDuran.day11_20.day16;
import java.util.Scanner;


public class menu {
    public static void main(String[] args) {
        PrintMenu();
        GetOrder();
    }

    public static void PrintMenu() {
        System.out.println("\t MENU");
        System.out.println("-----------------");
        System.out.println("SOUPS");
            System.out.println(" * Lentil \t"+"$3.99");
            System.out.println(" * Tomato \t"+"$4.99");
            System.out.println(" * Fish \t"+"$8.99");
        System.out.println("MEALS");
            System.out.println(" * Rice \t"+"$3.99");
            System.out.println(" * Chicken\t"+"$5.99");
            System.out.println(" * Beef \t"+"$7.99");
        System.out.println("SALADS");
            System.out.println(" * Ceaser \t"+"$3.99");
            System.out.println(" * Waldorf\t"+"$7.99");
    }

    public static void GetOrder() {
        String order="";
        Scanner scanner= new Scanner(System.in);
        System.out.println("what soup Lentil Tomato Fish");
        order += scanner.nextLine();
        System.out.println("what Meal Rice Chicken Beef");
        order += scanner.nextLine();
        System.out.println("what Salad Ceaser Waldorf");
        order += scanner.nextLine();
        Receipt(order);
    }

    public static void Receipt(String order) {
        double total = 0;
        if (order.contains("Lentil")){
            total += 3.99;
        }
        if (order.contains("Tomato")){
            total += 4.99;
        }
        if (order.contains("Fish")){
            total += 8.99;
        }
        if (order.contains("Rice")){
            total += 3.99;
        }
        if (order.contains("Chicken")){
            total += 5.99;
        }
        if (order.contains("Beef")){
            total += 7.99;
        }
        if (order.contains("Ceaser")){
            total += 3.99;
        }
        if (order.contains("Waldorf")){
            total += 7.99;
        }

        System.out.println("$"+total);
    }

}