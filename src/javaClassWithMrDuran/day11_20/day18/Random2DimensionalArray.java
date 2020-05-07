package javaClassWithMrDuran.day11_20.day18;

public class Random2DimensionalArray {
    public static void main(String[] args) {

        int n = 6;
        /*
        int[][] x = new int [n][n];

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <n ; j++) {
                x[i][j] = (int) ( Math.random() * 10 );
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
         */
        String[][] y = new String[n][n];

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <n ; j++) {

                String word = "";
                for (int k = 0; k < 3; k++) {
                    word += (char ) ((int) (Math.random() * 26) + 97);
                }
                y[i][j] = word;
                System.out.print(y[i][j] + "\t");
            }
            System.out.println("\n");

        }


    }
}
