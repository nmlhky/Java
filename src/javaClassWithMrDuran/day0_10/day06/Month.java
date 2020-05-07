package javaClassWithMrDuran.day0_10.day06;
import java.util.Scanner;
public class Month {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String numbertext = scanner.next();

        int number = 0;

        switch (numbertext) {
            case "one":
                number = 1;
                break;
            case "two":
                number = 2;
                break;
            case "three":
                number = 3;
                break;
            case "four":
                number = 4;
                break;
            case "five":
                number = 5;
                break;
            default:
                System.out.println("not ok");
        }
        if (number!=0){
            System.out.println(number);
        }
    }
}
