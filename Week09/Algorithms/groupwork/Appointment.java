package Week09.Algorithms.groupwork;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
        static List<Appointment> possible = new ArrayList<>();
        static {
			LocalDate today = LocalDate.now();
			Duration d = Duration.ofHours(1);
			LocalTime timeRef = LocalTime.of(8, 0);
			ZoneId here = ZoneId.systemDefault();
			ZonedDateTime start = ZonedDateTime.of(today.atTime(timeRef), here);
			for (int t = 9; t < 18; t++) { // 8am to 5pm
				start = start.plus(d);
				if (t == 12) {
					continue;
				}
				possible.add(new Appointment(start, d)); // add appt every hour
			}
		}

		public static List<Appointment> getListOfOpenAppointments(List<Appointment> a1, List<Appointment> a2) {
            List<Appointment> appointments = possible.stream().collect(Collectors.toList());
            a1.stream().forEach(appointment -> appointments.remove(appointment));
            a2.stream().forEach(appointment -> appointments.remove(appointment));
            return appointments;
        }
	}

    @Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE MMMM d 'at' h:mm a z");
		return duration.toMinutes() + "min appointment on " + start.format(dtf);
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		return result;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Appointment other = (Appointment) obj;
		if (duration == null) {
			if (other.duration != null) {
				return false;
			}
		} else if (!duration.equals(other.duration)) {
			return false;
		}
		if (start == null) {
			if (other.start != null) {
				return false;
			}
		} else if (!start.equals(other.start)) {
			return false;
		}
		return true;
	}
}