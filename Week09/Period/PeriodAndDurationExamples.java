package Week09.Period;

import java.time.Duration;
import java.time.Period;

public class PeriodAndDurationExamples {
    public static void main(String[] args) {
        Period oneYear = Period.ofYears(1);
        System.out.println(oneYear);
        
        Period longTime = Period.of(100, 2, 1);
        System.out.println(longTime);
        
        Duration twoDays = Duration.ofDays(2);
        System.out.println(twoDays);
        
        Duration oneHour30min = Duration.ofMinutes(90);
        System.out.println(oneHour30min);
    }
}
