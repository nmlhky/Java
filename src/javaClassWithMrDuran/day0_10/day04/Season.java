package javaClassWithMrDuran.day0_10.day04;
import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner Temperature = new Scanner(System.in);
        int tem = Temperature.nextInt();

        if(tem<=20){
            System.out.println("Winter");
        }else if(tem<=40){
            System.out.println("Fall");
        }else if(tem<=60){
            System.out.println("spring");
        }else{
            System.out.println("Summer");
        }
    }
}