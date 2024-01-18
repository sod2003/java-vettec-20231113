package Week09.Algorithms.groupwork;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class Appointment {
	
	// From assignment
	private ZonedDateTime start;
	private Duration duration;

    // Imported from assignment from the other day.
    public Appointment(ZonedDateTime start, Duration duration) {
        this.start = start;
        this.duration = duration;
    }

    public ZonedDateTime getStart() {
        return start;
    }

    public void setStart(ZonedDateTime start) {
        this.start = start;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void alert() {
        System.out.println("You have a " + duration.toMinutes() + "min appointment on " + start.format(DateTimeFormatter.ofPattern("EEE MMM dd 'at' h:mm a z")));
    }
	
	// Create a scheduling Assistant
	// Given two a list of appointments (one for each person)
	// Give me a list of possible meeting times
	static class SchedulingAssistant {
		public static List<Appointment> getListOfOpenAppointments(List<Appointment> a1, List<Appointment> a2) {
            List<Appointment> appointments = filledAppointmentList();
            for(Appointment appointment : appointments) {
                if(a1.contains(appointment)) {

                }
            }

            return appointments;
        }

        public static List<Appointment> filledAppointmentList() {
            List<Appointment> appointments = new LinkedList<Appointment>();
            LocalTime timeRef = LocalTime.of(8, 0, 0);
            LocalTime endTime = LocalTime.of(17, 0, 0);
            for (;timeRef.isBefore(endTime); timeRef.plusMinutes(30)) {
                appointments.add(new Appointment(ZonedDateTime.of(null, timeRef, null), Duration.ofMinutes(30)));
            }
            return appointments;
        }

        // public static double
	}

}