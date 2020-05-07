package javaClassWithMrDuran.day0_10.day05;

public class Year {
    public static void main(String[] args) {
        int year = 2000;
        if(year%100==0){
            if(year%400==0){
                System.out.println("Leap");
            }
            else{
                System.out.println("Not");
            }
        }
        else {
            if(year%4==0){
                System.out.println("Leap");
            }
            else {
                System.out.println("Not");
            }
        }
    }
}