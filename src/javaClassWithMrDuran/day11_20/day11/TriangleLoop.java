package javaClassWithMrDuran.day11_20.day11;

public class TriangleLoop {
    public static void main(String[] args) {
        for (int i = 1; i<10 ; i++) {
            for (int j = i ; j < 10; j++) {
                System.out.print("\t");
            }
            for (int n= 10 ; n>10-i ; n--){
                System.out.print("*   ");
            }

            System.out.println();
        }
    }
}