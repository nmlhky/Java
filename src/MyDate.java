import java.util.Date;

public class MyDate implements Comparable<MyDate> {

    private Date dateTime;

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date datetime) {
        this.dateTime = datetime;
    }

    @Override
    public int compareTo(MyDate o) {
        return getDateTime().compareTo(o.getDateTime());
    }
}
