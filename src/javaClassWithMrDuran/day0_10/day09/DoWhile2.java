package javaClassWithMrDuran.day0_10.day09;

public class DoWhile2 {
    public static void main(String[] args) {
        double i =100;
        do {
            if (i%1==0) {
                System.out.print((int)i );
            }else{
                System.out.println(i);
            }
            i = i - 0.5;
        }while (i >= 0 );
    }
}
