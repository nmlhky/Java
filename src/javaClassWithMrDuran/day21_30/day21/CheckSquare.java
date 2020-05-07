package javaClassWithMrDuran.day21_30.day21;

public class CheckSquare {
    public static void main(String[] args) {
        int[][] array = createIntArray(10,10);
        System.out.println(checkSquare(array));
    }


    public static int[][] createIntArray(int n, int m) {
        int[][] x = new int[n][m];
        int counter = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x[i][j] = counter;
                counter++;
            }
        }
        return x;
    }

    public static boolean checkSquare (int[][] arr){
        for (int[] ints : arr) {
            if (arr.length != ints.length)
                return false;
        }
        return true;
    }

}