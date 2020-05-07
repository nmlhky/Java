package javaClassWithMrDuran.day0_10.day05;

public class ElectricBill {
    public static void main(String[] args) {
        int com = 3000;

        if(com<500){
            System.out.println(com*0.3);
        }else if(com<1000){
            System.out.println(com*0.4);
        }else if(com<2000){
            System.out.println(com*0.5);
        }else {
            System.out.println(com*0.6);
        }

    }
}