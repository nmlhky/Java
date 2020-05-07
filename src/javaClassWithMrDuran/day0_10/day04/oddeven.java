package javaClassWithMrDuran.day0_10.day04;
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        if (num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
