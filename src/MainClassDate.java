import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class MainClassDate {
    public static void main(String[] args) throws ParseException {
        List<Date> expected = new ArrayList<>();
        List<String> tarih = new ArrayList<>();
        tarih.add("9/21/2021, 10:30 am");
        tarih.add("9/22/2021, 01:21 AM");
        tarih.add("10/21/2021, 09:30 AM");
        tarih.add("1/22/2021, 09:30 PM");
        tarih.add("1/22/2021, 9:30 PM");

        for (String dateStr: tarih) {
            SimpleDateFormat  formatter = new SimpleDateFormat("MM/dd/yyyy, HH:mm aa");
            Date date = formatter.parse(dateStr);
            expected.add(date);
            System.out.println(date);
        }

        System.out.println(expected);
        Collections.sort(expected);
        System.out.println(expected);
    }


}
