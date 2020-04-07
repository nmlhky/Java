package HackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try{
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println(x/y);
        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
