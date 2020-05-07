package javaClassWithMrDuran.day11_20.day12;

public class pyremid {
    public static void main(String[] args) {
        for (int i = 0; i<10 ; i++){
            for (int j = 0 ; j<10-i ; j++){
                System.out.print("   ");
            }
            for (int k = 0 ; k < (2*i)+1 ; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
