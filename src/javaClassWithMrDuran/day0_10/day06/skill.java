package javaClassWithMrDuran.day0_10.day06;
import java.util.Scanner;
public class skill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what computer language do you know (java / sql / cloud)");
        String l = scanner.next();

        if (l.equals("java")){
            System.out.println("QA Score (0-100)");
        } else if (l.equals("sql")){
            System.out.println("Hackerrank Score");
        } else if (l.equals("cloud")){
            System.out.println("Certification?");
        } else {
            System.out.println("enter java / sql / cloud");
        }
    }
}
