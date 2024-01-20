package Week09.Algorithms.groupwork;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class AppointmentSchedulerTests {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
		Duration d = Duration.ofHours(1);
		LocalTime time1 = LocalTime.of(10, 0);
		LocalTime time2 = LocalTime.of(13, 0);
		ZoneId here = ZoneId.systemDefault();
        List<Appointment> matt = new ArrayList<Appointment>();
        matt.add(new Appointment(ZonedDateTime.of(today.atTime(time1), here), d));
        List<Appointment> rod = new ArrayList<Appointment>();
        rod.add(new Appointment(ZonedDateTime.of(today.atTime(time2), here), d));
        
        System.out.println(Appointment.SchedulingAssistant.getListOfOpenAppointments(matt, rod));
    }
}
