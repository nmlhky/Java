package javaClassWithMrDuran.day11_20.day13;

public class SomeFunctions {
    public static void main(String[] args) {
        PrintNumber();
        PrintASCII();
        PrintLowerCase();
        PrintUpperCase();
    }

    public static void PrintNumber(){
        for (int i = 100 ; i <=1000 ; i++){
            System.out.print(i);
        }
    }
    public static void PrintASCII(){
        for (char i = 0 ; i < 256 ; i++){
            System.out.print(i);
        }
    }
    public static void PrintLowerCase(){
        for (char i = 'a' ; i <= 'z' ; i++){
            System.out.print(i);
        }
    }
    public static void PrintUpperCase(){
        for (char i = 'A' ; i <= 'Z' ; i++){
            System.out.print(i);
        }
    }
}
