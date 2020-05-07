package javaClassWithMrDuran.day0_10.day09;

public class ForLoop1abcd {
    public static void main(String[] args) {
        //for loop
        for (int i = 1; i <6 ; i++){
            System.out.print(i + " ");
            for (char c = 65 ; c<70 ; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        //enf for loop
        System.out.println("-----------------");
        //while loop
        int i = 1;
        char c ;
        while (i<6){
            System.out.print(i+" ");
            c = 65;
            while (c<70){
                System.out.print( c +" ");
                c++;
            }
            System.out.println();
            i++;
        }

    }
}
