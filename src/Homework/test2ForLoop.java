package Homework;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class test2ForLoop {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            for(int k =0; k<15; k++){
                System.out.print(s1+ " ");
            }
        }
        System.out.println("================================");

    }
}



