package javaClassWithMrDuran.day0_10.day08;

public class homeWork {

    public static void main(String[] args) {
        System.out.print("\t");
        for (int n = 1; n < 11; n++){
            System.out.print("\t"+n);
        }
        System.out.println("\n------------------------------------------------");
        for (int i = 1; i < 11; i++) {
            System.out.print(i+"\t|");
            for (int j = 1; j < 11; j++) {
                System.out.print("\t"+i*j);
            }
            System.out.print("\t|");
            System.out.println("");
        }

        System.out.println("-------------------------------------------------");

    }
}