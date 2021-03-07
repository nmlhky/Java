package codility;

import java.util.LinkedHashSet;


public class Elevator {
    public static void main(String[] args) {

        Elevator t = new Elevator();
//        int[] A = {60, 80, 40};
//        int[] B = {2, 3, 5};
//        int M = 5;
//        int X = 2;
//        int Y = 200;
        int[] A = {40, 40, 100,80,20};
        int[] B = {3, 3, 2,2,3};
        int M = 3;
        int X = 5;
        int Y = 200;
        System.out.println(t.solution(A, B, M, X, Y));

    }



    public int solution(int[] A, int[] B, int M, int X, int Y) {
        int i = 0;
        int countStop = 0;
        while(i < A.length) {
            long groupWeight = 0;
            int cap = 0;

            LinkedHashSet uniqueFloors = new LinkedHashSet();
            while(cap < X && i < A.length && groupWeight + A[i] <= Y) {
                groupWeight = groupWeight + A[i];
                uniqueFloors.add(B[i]);
                i++;
                cap++;
            }
            countStop = countStop + uniqueFloors.size() + 1;
        }
        return countStop;
    }

}
