package day31Methods;

public class Bank {
    int accountNumber;
    String accountName;
    Double balance;

    public Bank(int accountNumber, String accountName, Double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    void AddMoney(){
        this.balance++;
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
