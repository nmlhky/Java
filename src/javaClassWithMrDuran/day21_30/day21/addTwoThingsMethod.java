package javaClassWithMrDuran.day21_30.day21;

public class addTwoThingsMethod {
    public static void main(String[] args) {
        char a = add2char('a','b');
    }

    public static int add2int (int n , int m){
        int total = n + m;
        return total;
    }

    public static double add2double (double n , double m){
        double total = n + m;
        return total;
    }

    public static char add2char (char n , char m){
        char total =  (char)((int)n + (int)m );
        return total;
    }

    public static String add2String (String n , String m){
        String total = "" + n + m;
        return total;
    }


}
