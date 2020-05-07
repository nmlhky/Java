package javaClassWithMrDuran.day0_10.day09;

public class ForLoop2 {
    public static void main(String[] args) {
        //for for
        for (int i = 1 ; i<26 ; ){
            for (int j = 0 ; j<5 ; j++){
                System.out.print(i+"\t");
                i++;
            }
            System.out.println();
        }

        System.out.println("------------");
        //while while

        int n = 1;
        while (n<25){
            int m = 0;
            while (m<5){
                System.out.print(n+"\t");
                m++;
                n++;
            }
            System.out.println();
        }

    }
}
