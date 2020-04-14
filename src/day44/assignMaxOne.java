package day44;


import java.util.Scanner;

public class assignMaxOne {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

//        result
//        a = 5
//        b = 10

    }
}
