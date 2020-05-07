package javaClassWithMrDuran.day53_54Questions;

public class Recursions {
    public static void main(String[] args) {
        System.out.println(power(3,3));
    }

    public static long fact(long number){
        if (number==1) return 1;
        return number * fact(number-1);
    }

    public static long power(long number , int power){
        return (power!=1) ? number * power(number,power-1) : number;
    }

}
