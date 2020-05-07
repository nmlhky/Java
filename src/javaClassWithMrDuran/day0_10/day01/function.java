package javaClassWithMrDuran.day0_10.day01;

public class function {
    public static void  main(String[] args){


        FToC(70);
        CToF(21);

    }

    public static void  FToC(double fah){
        double cel = (fah - 32) *5 / 9;
        System.out.println(cel);
    }
    public static void CToF (double cel){
        double fah = cel * 9 /5 + 32;
        System.out.println(fah);
    }

}
