package HackerRank;

import java.time.LocalDate;

public class DateToDay {

    public static void main(String[] args) {

        int month = 4;
        int day = 28;
        int year = 1994;
        System.out.println(LocalDate.of(year, month, day).getDayOfWeek().name());
    }
}
