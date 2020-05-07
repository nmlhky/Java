package javaClassWithMrDuran.day21_30.day21;

public class TenByTenTriangle {
    public static void main(String[] args) {
        int[][] a= createIntArray(5,5);
        printArray(a);
    }

    public static int[][] createIntArray(int n, int m){
        int[][] x = new int [n][m];
        int counter = 1;

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <m ; j++) {
                x[i][j] = counter;
                counter ++;
            }
        }
        return x;
    }

    public static void printArray(int[][] x){

        for (int i = 0 ; i < x.length ; i++){
            for (int j = 0 ; j <= i ; j++) {

                System.out.format("%4d", x[i][j]);

            }
            System.out.println();
        }
    }
}
