package javaClassWithMrDuran.day0_10.day05;

import java.util.Scanner;

public class job {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("age");
        int age  = in.nextInt();
        System.out.println("java score");
        int java = in.nextInt();

        if (age < 20) {
            System.out.println("Sorry you are too young");
        }else if ( age<31 ) {
            if (java >= 80) {
                System.out.println((age * 1.5) + (java * 4.5));
            } else {
                System.out.println((age * 1.5) + (java * 3.5));
            }
        }else {
            if (java >= 80) {
                System.out.println((age * 1.1) + (java * 4.5));
            } else {
                System.out.println((age * 1.1) + (java * 3.5));
            }
        }

    }
}
