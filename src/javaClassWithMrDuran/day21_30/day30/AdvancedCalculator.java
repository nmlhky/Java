package javaClassWithMrDuran.day21_30.day30;

public class AdvancedCalculator extends Calculator {
    protected String screenColor;

    public AdvancedCalculator() {
        super();
        this.screenColor = "blue";
    }

    public int Average (int number1, int number2){
        this.displayValue =  (number1 + number2) / 2;
        return displayValue;
    }

    public int calFactorial(int number){
        int result=1;
        for (int i = number; i <1 ; i--) {
            result = i*result;

        } return result;
    }

    public int sqrt (int number1){
        this.displayValue =  (int)Math.sqrt(number1);
        return displayValue;
    }

    public int pow (int number1, int number2){
        this.displayValue =  (int) Math.pow(number1,number2);
        return displayValue;
    }
}
