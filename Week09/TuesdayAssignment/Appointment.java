package Week09.TuesdayAssignment;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {
    private ZonedDateTime start;
    private Duration duration;

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

    public static void main(String[] args) {
        Appointment appt = new Appointment(ZonedDateTime.now().plusDays(1), Duration.ofMinutes(30));
        appt.alert();
    }
}
