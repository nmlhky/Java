package javaClassWithMrDuran.day21_30.day22;

public class CreateRandomPassword {
    public static void main(String[] args) {
        System.out.println(createPassword());
    }

    public static String createPassword (){

        char[] lower = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] symbol = "!@#$%^&*()_+=-[]}{';,./".toCharArray();
        char[] number = "1234567890".toCharArray();

        char[][] chars = {lower,capital, symbol , number};

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars);
        }

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------");

        String password = "";


        //3 lower, 3 capital, 1 sybol, 4 number  kyyKUQ}7647
        for (int i = 0 ; i < 3 ; i++)
            password += chars[0] [ (int) ( Math.random() * chars[0].length )   ] ;
        for (int i = 0 ; i < 3 ; i++)
            password += chars[1] [ (int) ( Math.random() * chars[1].length )   ] ;

            password += chars[2] [ (int) ( Math.random() * chars[2].length )   ] ;

        for (int i = 0 ; i < 4 ; i++)
            password += chars[3] [ (int) ( Math.random() * chars[3].length )   ] ;


        //3 char each array  qpoBKI;(_332
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < 3 ; j++)
                password += chars[i] [ (int) ( Math.random() * chars[i].length )   ] ;
        }


        //All random  (Btb4tw4tt/1
        for (int i = 0 ; i < 12 ; i++){
            int random0to3 = (int) (Math.random()*4);
            password += chars[random0to3] [ (int) ( Math.random() * chars[random0to3].length )   ] ;
        }

        return password;
    }
}