package javaClassWithMrDuran.day52Enum;

public class DaysEnum {
    enum Days{
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday;

    }
    public static void main(String[] args){
        for (Days day : Days.values())
            System.out.println(day);
    }

}
