package javaClassWithMrDuran.day21_30.day25;

public class converting {
    public static void main(String[] args) {
        System.out.println(convert(3));
        System.out.println(convert(3.0));
    }

    public static double convert (int inch){
        return inch/2.54;
    }

    public static double convert (double cm){
        return cm * 2.54;
    }

}
