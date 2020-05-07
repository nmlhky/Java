package javaClassWithMrDuran.day0_10.day04;
import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        Scanner AgeInput = new Scanner(System.in);
        int age = AgeInput.nextInt();

        if(age<=0){
            System.out.println("cannot be negative");
        }else if(age>=120){
            System.out.println("cannot be larger than 120");
        }else{
            System.out.println("Okay");
        }
    }
}
