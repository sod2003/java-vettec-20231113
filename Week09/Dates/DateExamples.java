package Week09.Dates;
import java.time.LocalDate;

public class DateExamples {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);
    }
}
