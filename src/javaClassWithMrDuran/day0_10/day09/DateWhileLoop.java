package javaClassWithMrDuran.day0_10.day09;

public class DateWhileLoop {
    public static void main(String[] args) {
        int month = 1;

        while (month<13){
            int day = 1;
            while (day<31){
                System.out.println(month+"/"+day);
                day++;
            }
            month++;
        }
    }
}
