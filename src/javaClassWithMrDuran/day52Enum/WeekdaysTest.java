package javaClassWithMrDuran.day52Enum;

public class WeekdaysTest {
    public static void main(String[] args) {
        Weekdays day1 = Weekdays.Friday;
        Weekdays day2 = Weekdays.Saturday;

        System.out.print(day1 + " : ");
        System.out.println(day1.getDaysGreeting());
        System.out.print(day2 + " : ");
        System.out.println(day2.getDaysGreeting());
        System.out.println(day2.isWeekend());

        if(day1.isWeekend()) System.out.println(day1 + " is weekend");
        if(day2.isWeekend()) System.out.println(day2 + " is weekend");
    }
}
