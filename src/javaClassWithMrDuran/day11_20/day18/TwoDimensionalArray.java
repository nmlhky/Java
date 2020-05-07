package javaClassWithMrDuran.day11_20.day18;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] x = new int [3][3];
        int counter = 1;

        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j <3 ; j++){
                x[i][j]=counter ;
                counter++;
            }
        }

        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j <3 ; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        for (int k[] : x){
            for (int m : k){
                System.out.print(m+ " ");
            }
            System.out.println();
        }

    }
}
