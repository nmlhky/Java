package hackerRank;
import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j = 0 ; j<n ; j++){
                int total = (int) ((Math.pow(2,j)*b) +a) ;


                System.out.print (total + a +" ");
            }

            System.out.println();


        in.close();

        System.out.println("2 6 14 30 62 126 254 510 1022 2046 ");


    }
}
