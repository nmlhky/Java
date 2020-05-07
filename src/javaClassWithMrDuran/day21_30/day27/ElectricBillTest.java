package javaClassWithMrDuran.day21_30.day27;

public class ElectricBillTest {
    public static void main(String[] args) {
        ElectricBill myBill = new ElectricBill(9878,0,"home",0.0);

        System.out.println(myBill.toString());

        myBill.addComsumption(100);

        System.out.println(myBill.displayBill());
    }
}
