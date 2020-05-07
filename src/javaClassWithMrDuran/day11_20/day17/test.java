package javaClassWithMrDuran.day11_20.day17;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] number = new  int[5] ;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i<5 ; i++){

            number[i] = scanner.nextInt();
        }

        scanner.close();

        for (int j = 0 ; j<5 ; j++){
            System.out.println(number[j]);
        }

    }
}
