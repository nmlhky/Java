package javaClassWithMrDuran.day11_20.day16;

public class CarLoan {
    public static void main(String[] args) {

        System.out.println(CalculateCarLoan(400,15));
    }

    public static int CalculateCarLoan(int monthly, int mounthNumber){
        int totalAmount = 35000;

        int restPayment = totalAmount - monthly*mounthNumber;

        return restPayment;

    }
}
