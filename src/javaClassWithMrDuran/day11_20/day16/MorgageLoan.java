package javaClassWithMrDuran.day11_20.day16;

public class MorgageLoan {
    public static void main(String[] args) {
        System.out.println(restpayment(1500,35));
    }

    public static int restpayment(int monthly,int paymentNumber){
        int totalMonths = 72;
        return (totalMonths-paymentNumber)*monthly;
    }
}
