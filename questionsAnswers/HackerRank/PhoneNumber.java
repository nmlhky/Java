package HackerRank;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneNumber{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();



        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }


        while(in.hasNext())
        {
            String s=in.nextLine();

            try{
                int temp = phoneBook.get(s);
                System.out.println(s+"="+temp);
            }catch(NullPointerException e){
                System.out.println("Not found");
            }

        }



    }
}
