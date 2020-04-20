package dailyGroupTask;

import javax.swing.*;
import java.util.Scanner;
import java.util.SplittableRandom;

public class task001 {
    public static void main(String[] args) {
        //printBFI(bodyFitIndex());

        //System.out.println(isEqual(4,4));

        System.out.println(nameShuffle("melih kaya"));
    }

    public static String nameShuffle(String s) {
        String s1 = "";
        String s2 = "";

        boolean isFirstString = true;
        for (int i = 0; i < s.length(); i++) {
            while (isFirstString){
                if (s.charAt(i) == ' '){
                    isFirstString = false;
                    i++;
                    break;
                }
                s1 += s.charAt(i);
                i++;
            }
            s2 += s.charAt(i);
        }

        String s3 = s2 + " " + s1;
        return s3;
    }

    public static String getWord(String left, String right) {
        String result = "";
        result += left.charAt(0);

        result = result.toUpperCase();

        for (int i = 1; i < left.length(); i++) {
            result += left.charAt(i);
        }
        for (int i = 0; i < right.length(); i++) {
            result += right.charAt(i);
        }
        return result;
    }

    public static int differenceMaxMin(int[] arr) {
        int min = arr[0] ;
        int max = arr[0] ;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        return max-min;
    }

    public static boolean isEqual(int num1, int num2) {
        if(num1 == num2) return true;
        else return false;
    }

    public static int convert(int hours, int minutes) {
        int second = (hours * 3600) + (minutes * 60);

        return second;
    }

    public static String reverse(final String str) {
        String reverse = "";

        for (int i = str.length()-1 ; i >= 0  ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
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