package javaClassWithMrDuran.day11_20.day12;

public class NumberPyramid {
    public static void main(String[] args) {
        for (int i = 1; i < 8 ; i++){
            for (int j = 0 ; j<i ; j++){
                System.out.print(" ");
            }
            for (int n= i ; n < 8 ; n++){
                System.out.print(" "+n);
            }
            System.out.println();
        }
        //------------
        for (int n = 1; n<8 ; n++){
            for (int m = 0 ; m<7-n ; m++){
                System.out.print(" ");
            }
            for (int k = 7-n ; k < 8 ; k++){
                System.out.print(" "+k);
            }
            System.out.println();
        }
    }
}
