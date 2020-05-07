package javaClassWithMrDuran.day39_40TryCatch;

public class division {
    public static void main(String[] args) {

        try {
            div(9,0);
        }
        catch(ArithmeticException e) {
            System.out.println("Division by zero not possible, please try again");
        }
    }


    public static double div(int a, int b){
        return a/b;
    }
}
