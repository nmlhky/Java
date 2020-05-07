package javaClassWithMrDuran.day21_30.day24;

import java.util.Scanner;

public class decisionsTree {
    public static void main(String[] args) {
        System.out.println(tree());

    }

    public static String tree (){
        Scanner in = new Scanner(System.in);
        System.out.print("Sea or Mountain");
        String a = in.nextLine();

        if(a.equals("sea") ){
            System.out.print("East or West cost?");
            String b = in.nextLine();
            if (b.equals("east"))
                return "Florida";
            else
                return "California";

        }else {
            System.out.print("Midland or North?");
            String c = in.nextLine();
            if (c.equals("midland"))
                return "Kansas";
            else
                return "Vermond";
        }
    }
}
