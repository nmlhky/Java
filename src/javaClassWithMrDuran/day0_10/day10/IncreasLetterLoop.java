package javaClassWithMrDuran.day0_10.day10;

public class IncreasLetterLoop {
    public static void main(String[] args) {
        char a = 'a';
        for (int i = 1  ; i<6 ; i++){

            System.out.print(i + "\t");
            for ( int j = 0; j < 5 ; j++ ){
                System.out.print(a + "\t");
                a++;
            }
            System.out.println();
        }

    }
}
