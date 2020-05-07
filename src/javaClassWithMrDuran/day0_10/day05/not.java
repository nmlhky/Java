package javaClassWithMrDuran.day0_10.day05;

public class not {
    public static void main(String[] args) {
        int score = 100;

        if(score > 0 && score < 50){
            System.out.println("Fail");
        }else if( score < 60){
            System.out.println("D");
        }else if( score < 70){
            System.out.println("C");
        }else if( score < 80){
            System.out.println("B");
        }else if( score < 90){
            System.out.println("A");
        }else if( score <= 100){
            System.out.println("A+");
        }else {
            System.out.println("Enter beetween 0 - 100");
        }
    }
}
