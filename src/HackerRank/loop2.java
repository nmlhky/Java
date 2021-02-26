package questionsAnswers.HackerRank;
import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                int t=in.nextInt();
                for(int i=0;i<t;i++){
                    int a = in.nextInt();
                    int b = in.nextInt();
                    int n = in.nextInt();

                    int x = 0;

                    for(int j = 0 ; j<n ; j++){

                        x= (int) Math.pow(2,j)*b + x;

                        System.out.print(a+x+" ");

                    }
                    System.out.println();


                }
                in.close();


            }
        }