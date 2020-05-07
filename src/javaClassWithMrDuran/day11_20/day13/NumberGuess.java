package javaClassWithMrDuran.day11_20.day13;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Guess();
    }

    public static void Guess(){
        Scanner in = new Scanner(System.in);
        int n = 55;
        int x= 0;

        while (x!=n){
            System.out.println("enter number 0-100 : ");
            x = in.nextInt();
            if (x<n){
                System.out.println("bigger");
            }else if(x>n){
                System.out.println("smaller");
            }else {
                System.out.println("done");
            }
        }
    }
}
