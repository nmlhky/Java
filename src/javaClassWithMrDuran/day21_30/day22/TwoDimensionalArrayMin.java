package javaClassWithMrDuran.day21_30.day22;

public class TwoDimensionalArrayMin {
    public static void main(String[] args) {
        int[][] a= createIntArray(5,5);
        printArray(a);
        printMax(a);
        printMin(a);
        differenceMaxToMin(a);
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
            max = x[i][0];
            for (int j = 0 ; j < x[i].length ; j++) {
                if (x[i][j] > max)
                    max = x[i][j];
            }
            System.out.println("Maximum number in row "+i+ " : "+max);
        }
    }

    public static void printMin(int[][] x){
        int min ;

        for (int i = 0 ; i < x.length ; i++){
            min = x[i][0];
            for (int j = 0 ; j < x[i].length ; j++) {
                if (x[i][j] < min)
                    min = x[i][j];
            }
            System.out.println("Minumum number in row "+i+ " : "+min);
        }
    }

    public static void differenceMaxToMin(int[][] x){
        int min ,max ;

        for (int i = 0 ; i < x.length ; i++){
            min = x[i][0];
            max = x[i][0];
            for (int j = 0 ; j < x[i].length ; j++) {
                if (x[i][j] < min)
                    min = x[i][j];
                if (x[i][j] > min)
                    max = x[i][j];
            }
            int dif = max - min;
            System.out.println("Diffirence Between max to min  in row "+ (i+1) + " : "+ (max-min) );
        }
    }

}
