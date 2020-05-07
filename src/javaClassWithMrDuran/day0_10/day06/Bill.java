package javaClassWithMrDuran.day0_10.day06;
import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("are you member y or n :");
        String member = scanner.nextLine();

        if (member.equals("y")){
            System.out.println("how many gb data do you need : ");
            int data = scanner.nextInt();

            if (data <101){
                System.out.println("$10");
            } else {
                System.out.println("$40");
            }
        } else {
            System.out.println("you need a membership");
        }
    }
}