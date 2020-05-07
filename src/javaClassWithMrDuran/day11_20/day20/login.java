package javaClassWithMrDuran.day11_20.day20;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        String user= "melih";
        String pass= "kaya";

        Scanner s = new Scanner(System.in);
        for (int i = 0 ; i<5 ; i++){
            String u = s.nextLine();
            String p = s.nextLine();
            if (u.equals(user) && p.equals(pass)){
                System.out.println("okay");
                break;
            }
        }



    }

}