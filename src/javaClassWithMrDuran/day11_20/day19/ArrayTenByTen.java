package javaClassWithMrDuran.day11_20.day19;

public class ArrayTenByTen {
    public static void main(String[] args) {
        int[][] a= createIntArray(5,15);
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
            for (int j = 0 ; j <x[0].length ; j++) {

                    System.out.format("%4d", x[i][j]);

            }
            System.out.println();
        }
    }

    public static void printArrayWithRowSum(int[][] x){

        for (int i = 0 ; i < x.length ; i++){
            int rowSum = 0;
            for (int j = 0 ; j <x[0].length ; j++) {
                if (j==x[0].length-1) {
                    System.out.format("%3d", x[i][j]);
                    rowSum += x[i][j];
                    continue;
                }
                System.out.format("%4d  +", x[i][j]);
                rowSum += x[i][j];
            }
            System.out.println("\t= "+rowSum);
        }
    }

    public static void printArrayWithColomSum(int[][] x){

        int[] totalcolom = new int[x[0].length];
        for (int i = 0 ; i < x.length ; i++){
            for (int j = 0 ; j <x[0].length ; j++) {
                System.out.format("%5d",x[i][j]);
                totalcolom[j] += x[i][j];
            }
            System.out.println();

        }

        System.out.println("----------------------------------------------------");

        for (int m = 0 ; m <totalcolom.length ; m++){
            System.out.format("%5d",totalcolom[m]);
        }

    }


}