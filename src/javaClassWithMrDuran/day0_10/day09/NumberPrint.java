package javaClassWithMrDuran.day0_10.day09;

public class NumberPrint {
    public static void main(String[] args) {
        //for loop
        for (int i = 1 ; i < 25 ; i++){
            System.out.print(i+"\t");
            if (i%5==0) System.out.println();
        }
        //
        System.out.println("\n------------");
        //while
        int j = 1;
        while (j<25){
            System.out.print(j+"\t");
            if (j%5==0) System.out.println();
            j++;
        }
        //
        System.out.println("\n-----------");
        //do while
        int n = 1;
        do{
            System.out.print(n+"\t");
            if (n%5==0) System.out.println();
            n++;
        }while (n<26);
    }
}
