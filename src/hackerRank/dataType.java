package hackerRank;
import java.util.Scanner;
public class dataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767 )System.out.println("* short");
                if(x>=-Math.pow(2,31) && x<=Math.pow(2,31))System.out.println("* int");
                if(x>=-Math.pow(2,64) && x<=Math.pow(2,64))System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
