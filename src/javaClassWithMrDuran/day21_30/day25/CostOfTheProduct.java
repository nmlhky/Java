package javaClassWithMrDuran.day21_30.day25;

public class CostOfTheProduct {
    public static void main(String[] args) {
        System.out.println(cost(30));
        System.out.println(cost(30,5));
    }

    public static double cost(int basePrice){
        double tax = 107 / 100;
        return basePrice*tax * 1.1 ;
    }
    public static double cost(int basePrice, int shipCost){
        double tax = 107 / 100;
        return (basePrice + shipCost)*tax * 1.1 ;
    }
}
