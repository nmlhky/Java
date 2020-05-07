package javaClassWithMrDuran.day21_30.day25;

public class BankTest {
    public static void main(String[] args) {
        Bank myBank = new Bank("chase",150.0 , 123456);

        myBank.addMoney(15.6);

        System.out.println(myBank.checkBalance());

        myBank.drawMoney();

        System.out.println(myBank.checkBalance());
    }
}
