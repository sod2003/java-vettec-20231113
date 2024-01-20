package Week09.Algorithms.groupwork;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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
            List<Appointment> appointments = new ArrayList<Appointment>();
            List<LocalTime> eligibleTimes = filledAppointmentList();
            List<LocalTime> zt1 = a1.stream().map(appointment -> appointment.getStart().toLocalTime()).collect(Collectors.toList());
            List<LocalTime> zt2 = a2.stream().map(appointment -> appointment.getStart().toLocalTime()).collect(Collectors.toList());
            appointments = eligibleTimes.stream().filter(time -> {
               return ((zt1.contains(time)) && (zt2.contains(time)));
            })
            .map(time -> ZonedDateTime.of(a1.get(0).getStart().toLocalDate(), time, a1.get(0).getStart().getZone()))
            .map(zonedTime -> new Appointment(zonedTime, Duration.ofMinutes(30)))
            .collect(Collectors.toList());
            return appointments;
        }

        public static List<LocalTime> filledAppointmentList() {
            List<LocalTime> times = new LinkedList<LocalTime>();
            LocalTime timeRef = LocalTime.of(8, 0, 0);
            LocalTime endTime = LocalTime.of(17, 0, 0);
            for (;timeRef.isBefore(endTime); timeRef.plusMinutes(30)) {
                times.add(timeRef);
            }
            return times;
        }
	}

}