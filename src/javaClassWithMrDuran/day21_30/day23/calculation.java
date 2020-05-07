package javaClassWithMrDuran.day21_30.day23;

public class calculation {
    public static void main(String[] args) {


        System.out.println(doCalculation(3,4, "add"));

    }

    public static int doCalculation(int first_number , int second_number , String oparation){
        if (oparation.equals("add"))
            return first_number+second_number;
        if (oparation.equals("sub"))
            return first_number-second_number;
        if (oparation.equals("multi"))
            return first_number*second_number;
        if (oparation.equals("div"))
            return first_number/second_number;

        return 0;
    }
}
