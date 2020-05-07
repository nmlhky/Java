package javaClassWithMrDuran.day21_30.day21;

public class carRange {
    public static void main(String[] args) {
        System.out.println(carRange(3.5));
    }

    public static int carRange (double gallonInTheTank){
        int mpg = 42;
        int range = (int) (mpg * gallonInTheTank);
        return  range ;
    }


}
