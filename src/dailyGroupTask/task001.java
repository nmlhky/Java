package dailyGroupTask;

import java.util.Scanner;

public class task001 {
    public static void main(String[] args) {
        printBFI(bodyFitIndex());
    }

    public static double bodyFitIndex(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight (kg) = ");
        double weight = scanner.nextDouble();
        System.out.print("Height (mm) = ");
        double height = scanner.nextDouble();

        double bfi = weight / Math.pow( (height/100) , 2 );

        return bfi;
    }

    public static void printBFI(double bfi){
        System.out.format("Your body fit index = %.1f\n" , bfi);
        System.out.print("result is  = ");
        if (bfi <= 0) System.out.println("Invalid BFI");
        else if ( bfi <= 19.5) System.out.println("Underweight");
        else if (bfi <= 25) System.out.println("Normal");
        else if (bfi <= 30) System.out.println("Overweight");
        else if (bfi <= 80) System.out.println("Obese");
        else System.out.println("Invalid BFI");
    }

}