import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] c = new  int[] {0,0,0,0,1,0};

        System.out.println(jumpingOnClouds(c));

    }


    static int jumpingOnClouds(int[] c) {
        int count = 0 ;
        int n = c.length;
        for (int i = 0; i < n-2 ; count++) {
            if (c[i+2]==0  || c[i] == 1 ) i = i+2;
            else i++;
        }
        if (c[n-2]==0) count++;
        return count;



        int count = -1;
        for (int i = 0; i < n; i++, count++) {
            if (i<n-2 && c[i+2]==0) i++;
        }
        System.out.println(count);
    }
}
