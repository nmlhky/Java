package javaClassWithMrDuran.day31Methods;

public class Loan extends Bank {
    double interestRate;
    int numberOfPayment;
    double loanAmount;

    public Loan(int accountNumber, String accountName, Double balance, double interestRate, int numberOfPayment, double loanAmount) {
        super(accountNumber, accountName, balance);
        this.interestRate = interestRate;
        this.numberOfPayment = numberOfPayment;
        this.loanAmount = loanAmount;
    }

    double CalculateMontlyPayment(){
        return loanAmount * interestRate / numberOfPayment;
    }

    double CalculateTotalPayment(){
        return loanAmount * interestRate;
    }

}
