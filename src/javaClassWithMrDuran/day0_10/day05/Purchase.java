package javaClassWithMrDuran.day0_10.day05;
import java.util.Scanner;
public class Purchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Color red or blue");
        String color = scanner.nextLine();
        System.out.println("Price : ");
        int price = scanner.nextInt();
        System.out.println("Discount :");
        int dis = scanner.nextInt();

        int colorpoint = 0;
        if (color.equals("red")){ colorpoint = 20; }
        if (color.equals("blue")){ colorpoint = 10; }


        int point = ( price * (100-dis) / 100 ) - colorpoint ;

        if(point < 50){
            System.out.println("buy now");
        } else if(point <100 ){
            System.out.println("buy later");
        } else {
            System.out.println("dont buy");
        }
    }
}