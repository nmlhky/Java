package questionsAnswers.dailyGroupTask;

public class Task003 {
    public static void main(String[] args) {
        int[][] arr = {{2,7,6},{9,5,1},{4,3,8}};
        System.out.println(isMagicSquare(arr));
    }

    public static boolean isMagicSquare(int[][] square) {
        int check = 0;
        int sum = 0;

        for (int i = 0; i < square.length; i++) {
            check += square[0][i];
        }

        for (int i = 0; i < square.length; i++) {
            sum = 0;
            for (int j = 0; j < square[i].length; j++) {
                sum += square[i][j];
            }
            if (check != sum) return false;
        }

        for (int i = 0; i < square.length; i++) {
            sum = 0;
            for (int j = 0; j < square[i].length; j++) {
                sum += square[j][i];
            }
            if (check != sum) return false;
        }

        sum = 0;
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (i == j )
                    sum += square[i][j];
            }
        }
        if (check != sum) return false;

        sum = 0;
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (i == j ) {
                    sum += square[i][ (square.length-1)-j];
                }
            }
        }
        if (check != sum)  return false;

        return true;
    }
}
