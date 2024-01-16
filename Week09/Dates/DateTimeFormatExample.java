package Week09.Dates;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss a");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

        System.out.println(now.format(dtf));
        System.out.println(now.format(dtf2));
    }
}
