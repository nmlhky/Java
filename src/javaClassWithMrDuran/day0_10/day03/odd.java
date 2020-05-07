package javaClassWithMrDuran.day0_10.day03;

import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        if(num%2 == 1){
            System.out.println("odd");
        }
    }
}
