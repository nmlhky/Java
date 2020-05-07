package javaClassWithMrDuran.day0_10.day10;
import  java.util.Scanner;
public class CharAtindex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String :");
        String a = scanner.nextLine();
        int m = 0;
        int n=0;
        while (m <7) {
            if (a.charAt(m) == 'A' || a.charAt(m) == 'a' || a.charAt(m) == 'C') {
                System.out.println("Capitals : \t" + a.charAt(m) + "\t");
                System.out.println("aa");
            }
            m++;
        }
    }
}

