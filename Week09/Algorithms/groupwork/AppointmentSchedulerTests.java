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
        List<Appointment> matt = new ArrayList<Appointment>();
        matt.add(new Appointment(ZonedDateTime.of(LocalDate.now().plusDays(1), LocalTime.of(8, 30), ZoneId.systemDefault()), Duration.ofMinutes(30)));
        matt.add(new Appointment(ZonedDateTime.of(LocalDate.now().plusDays(1), LocalTime.of(10, 0), ZoneId.systemDefault()), Duration.ofMinutes(30)));
        matt.add(new Appointment(ZonedDateTime.of(LocalDate.now().plusDays(1), LocalTime.of(13, 30), ZoneId.systemDefault()), Duration.ofMinutes(30)));
        List<Appointment> rod = new ArrayList<Appointment>();
        rod.add(new Appointment(ZonedDateTime.of(LocalDate.now().plusDays(1), LocalTime.of(8, 0), ZoneId.systemDefault()), Duration.ofMinutes(30)));
        rod.add(new Appointment(ZonedDateTime.of(LocalDate.now().plusDays(1), LocalTime.of(10, 30), ZoneId.systemDefault()), Duration.ofMinutes(30)));
        rod.add(new Appointment(ZonedDateTime.of(LocalDate.now().plusDays(1), LocalTime.of(13, 30), ZoneId.systemDefault()), Duration.ofMinutes(30)));

        System.out.println(Appointment.SchedulingAssistant.getListOfOpenAppointments(matt, rod));
    }
}
