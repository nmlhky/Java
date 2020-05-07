package javaClassWithMrDuran.day52Enum;

public class Months{
    enum  Month{
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December,
    }


    public static void main(String[] args) {
        Month myMounth = Month.April;
        if (myMounth == Month.December || myMounth == Month.January || myMounth == Month.February )     System.out.println("Winter");
        if (myMounth == Month.March    || myMounth == Month.April   || myMounth == Month.May )          System.out.println("Spring");
        if (myMounth == Month.June     || myMounth == Month.July    || myMounth == Month.August )       System.out.println("Summer");
        if (myMounth == Month.September|| myMounth == Month.October || myMounth == Month.November )     System.out.println("Fall");
    }
}


