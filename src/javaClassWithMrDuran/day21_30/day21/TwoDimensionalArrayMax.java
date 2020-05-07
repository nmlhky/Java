package javaClassWithMrDuran.day21_30.day21;

public class TwoDimensionalArrayMax {
    public static void main(String[] args) {
        int[][] a= createIntArray(5,5);
        printArray(a);
        printMax(a);
    }

    public static int[][] createIntArray(int n, int m){
        int[][] x = new int [n][m];

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <m ; j++) {
                x[i][j] = (int) (Math.random()*10);
            }
        }
        return x;
    }

    public static void printArray(int[][] x){

        for (int i = 0 ; i < x.length ; i++){
            for (int j = 0 ; j < x[i].length ; j++) {

                System.out.format("%4d", x[i][j]);

            }
            System.out.println();
        }
    }

    public static void printMax(int[][] x){
        int max;

        for (int i = 0 ; i < x.length ; i++){
            max = 0;
            for (int j = 0 ; j < x[i].length ; j++) {
                if (x[i][j] > max)
                    max = x[i][j];
            }
            System.out.println("row "+i+"max number"+max);
        }
    }


}
