package javaClassWithMrDuran.day0_10.day04;
import java.util.Scanner;
public class jacket {
    public static void main(String[] args) {
        Scanner Tempature = new Scanner(System.in);
        int tem = Tempature.nextInt();

        if (tem<=30){
            System.out.println("wear jacket");
        }else{
            System.out.println("wear hat");
        }
    }
}