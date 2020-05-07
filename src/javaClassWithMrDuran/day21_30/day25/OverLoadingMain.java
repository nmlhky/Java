package javaClassWithMrDuran.day21_30.day25;


public class OverLoadingMain {
    public static void main(String[] a) {
        System.out.println("java fun (from main)");
        main("its fun");
    }

    public static void main(String arg1) {
        System.out.println("yes " + arg1);
        main("its fun ", "indeed");
    }

    public static void main(String args1 , String args2) {
        System.out.println("right " + args1  + args2);
    }
}
