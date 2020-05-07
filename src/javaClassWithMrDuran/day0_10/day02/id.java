package javaClassWithMrDuran.day0_10.day02;
import java.util.Scanner;
public class id {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        String name =  id.nextLine();
        String hair = id.nextLine();
        int age = id.nextInt();
        float weight = id.nextFloat();


        System.out.println(name+" "+age+" "+weight+" "+hair);

    }
}
