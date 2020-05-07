package javaClassWithMrDuran.day21_30.day22;

public class PrintRowToColums {
    public static void main(String[] args) {
        int[][] a= createIntArray(5,5);
        printArray(a);
        System.out.println("-----");
        int[][] b =  printArrayRowToColom(a);
        printArray(b);

        System.out.println("-------");

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

        for (int i = 0 ; i < x.length ; i++) {
            for (int j = 0; j < x[0].length; j++)
                System.out.format("%4d", x[i][j]);
            System.out.println();
        }
    }

    public static int[][] printArrayRowToColom (int[][] x){
        int length = x[0].length;
        for (int k = 0 ; k< x.length ; k++){
            if (x[k].length > length)
                length = x[k].length;
        }

        int[][] ArrayRowToColum = new int[x.length][length];

        for (int i = 0 ; i < x.length ; i++)
            for (int j = 0 ; j <length ; j++)
                ArrayRowToColum[i][j] =  x[j][i];

        return ArrayRowToColum;
    }

}
