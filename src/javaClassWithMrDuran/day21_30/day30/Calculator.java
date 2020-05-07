package javaClassWithMrDuran.day21_30.day30;

public class Calculator {
    protected int displayValue;

    public Calculator() {
        this.displayValue = 0;
    }

    public int Sum (int number1, int number2){
        this.displayValue =  number1+number2;
        return displayValue;
    }

    public int Divide (int number1, int number2){
        this.displayValue =  number1 / number2;
        return displayValue;
    }

    public int Sub (int number1, int number2){
        this.displayValue =  number1 - number2;
        return displayValue;
    }

    public int Multiply (int number1, int number2){
        this.displayValue =  number1 * number2;
        return displayValue;
    }
}