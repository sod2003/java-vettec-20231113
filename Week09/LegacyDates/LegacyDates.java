package Week09.LegacyDates;

import java.util.Date;

public class LegacyDates {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);
        
        Date tomorrow = new Date(2024, 1, 17);
        System.out.println(tomorrow);
        
        Date correctTomorrow = new Date(124, 0, 17);
        System.out.println(correctTomorrow);
    }
}
