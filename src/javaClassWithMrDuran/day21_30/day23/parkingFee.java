package javaClassWithMrDuran.day21_30.day23;

public class parkingFee {
    public static void main(String[] args) {
        System.out.println(parkingFeeCalculation(4,true));
    }

    public static int parkingFeeCalculation (int hours , boolean member ){
        if (member != true){

            if (hours >= 1 && hours < 2)
                return 3;
            if (hours >= 2 && hours < 7)
                return 5;
            if (hours >= 7 && hours < 12)
                return 10;
                return 15;
        }

        return 0;
    }
}
