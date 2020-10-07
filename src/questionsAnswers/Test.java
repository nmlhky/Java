package questionsAnswers;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        int[] arr = {7,7,42,42,1,56,55,75};
        System.out.println(solution(7,7,arr));

    }

    public static int  solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX++;
            else if (A[i] == Y)
                nY++;
            if (nX == nY)
                result = i;
        }
        return result;
    }


}
