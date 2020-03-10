package day22;

public class CreateRandomPassword {
    public static void main(String[] args) {
        System.out.println(createPassword());
    }

    public static String createPassword (){
        char[] lower = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] symbol = "@#$%^&*(){}".toCharArray();
        char[] number = "1234567890".toCharArray();

        char[][] chars = {lower,capital, symbol , number};

        String password = "";

        //3 char each array  dgfBKH#^#123
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < 3 ; j++)
                password += chars[i] [ (int) ( Math.random() * chars[i].length )   ] ;
        }


        //3 lower 3 capital 1 sybol 4 number
        for (int i = 0 ; i < 3 ; i++)
            password += chars[0] [ (int) ( Math.random() * chars[0].length )   ] ;
        for (int i = 0 ; i < 3 ; i++)
            password += chars[1] [ (int) ( Math.random() * chars[1].length )   ] ;

            password += chars[2] [ (int) ( Math.random() * chars[2].length )   ] ;

        for (int i = 0 ; i < 4 ; i++)
            password += chars[3] [ (int) ( Math.random() * chars[3].length )   ] ;


        return password;
    }
}
