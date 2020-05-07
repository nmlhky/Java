package javaClassWithMrDuran.day0_10.day06;
import java.util.Scanner;
public class Car {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("x or y");
        String model = scanner.nextLine();

        if (model.equals("x")){
            int msrp = 30;
            System.out.println("body(b) $5k , sound(s) $3k ");
            String extra = scanner.nextLine();
            if (extra.contains("b")){
                msrp += 5;
            }
            if (extra.contains("s")){
                msrp += 3;
            }

            System.out.println("total price is : $" + msrp +"k");

        }else if (model.equals("y")){
            int msrp = 35;
            System.out.println("entartain(e) $8k , safety(s) $4k ");
            String extra = scanner.nextLine();
            if (extra.contains("e")){
                msrp += 8;
            }
            if (extra.contains("s")){
                msrp += 4;
            }

            System.out.println("total price is : $" + msrp +"k");

        }else {
            System.out.println("not ok");
        }
    }
}