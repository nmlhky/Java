package javaClassWithMrDuran.day52Enum;

public enum Weekdays {
    Sunday("Sunday Funday",true),
    Monday("Marketing monday"),
    Tuesday("Trendy tuesday"),
    Wednesday("Wellness Wednesday"),
    Thursday("Thankfull Thursday"),
    Friday("Foodie friday"),
    Saturday("Social Saturday", true);
    private String daysGreeting;
    private boolean isWeekend;

    Weekdays(final String daysGreeting) {
        this.daysGreeting = daysGreeting;
    }

    Weekdays(final String daysGreeting, final boolean isWeekend) {
        this.daysGreeting = daysGreeting;
        this.isWeekend = isWeekend;
    }

    public String getDaysGreeting() {
        return daysGreeting;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}
