package javaClassWithMrDuran.day11_20.day11;

public class Star {
    public static void main(String[] args) {
        //for
        /*for (int i = 0; i<4 ; i++){
            for (int j = 0; j<4 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //while
        int i=0 , j=0;
        while (i<5){
            j=0;
            while(j<5){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
