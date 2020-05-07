package javaClassWithMrDuran.day11_20.day18;

public class Array10x10 {
    public static void main(String[] args) {
        int[][] a= createIntArray(10);
        printarray(a);
    }

    public static int[][] createIntArray(int n){
        int[][] x = new int [n][n];
        int counter = 1;


        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <n ; j++) {
                x[i][j] = counter;
                counter++;
            }
        }
        return x;
    }

    public static void printarray(int[][] x){

        int[] totalcolom = new int[10];

        for (int i = 0 ; i < 10 ; i++){
            int totalrow = 0;
            for (int j = 0 ; j <10 ; j++) {
                System.out.format("%5d",x[i][j]);
                totalrow += x[i][j] ;
                totalcolom[j] += x[i][j];
            }
            System.out.println( "|\t" + totalrow);

        }

        System.out.println("--------------------------------------------------");

        for (int m = 0 ; m <10 ; m++){
            System.out.format("%5d",totalcolom[m]);
        }

    }

}
