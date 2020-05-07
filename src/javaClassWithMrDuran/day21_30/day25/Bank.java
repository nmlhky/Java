package javaClassWithMrDuran.day21_30.day25;

public class Bank {
    String name;
    double balance;
    int accountNumber;

    public Bank(String name, Double balance , int accountNumber){
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double checkBalance(){
        return balance;
    }

    public void addMoney (){
        balance += 10;
    }
    public void addMoney (Double amount){
        balance += amount;
    }

    public void drawMoney (){
        balance -=  10;
    }
    public void drawMoney (Double amount){
        balance -=  amount;
    }


}
