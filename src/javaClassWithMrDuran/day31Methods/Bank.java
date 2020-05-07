package javaClassWithMrDuran.day31Methods;

public class Bank {
    private int accountNumber;
    private String accountName;
    private Double balance;

     Bank(int accountNumber, String accountName, Double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    void addMoney(int value){
        this.balance += value;
    }

    void DrawMoney(){
        this.balance--;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
