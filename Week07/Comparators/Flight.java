package Week07.Comparators;
import java.util.PriorityQueue;

public class Flight {
    PriorityQueue<Passenger> passengers;

    public Flight() {
        this.passengers = new PriorityQueue<Passenger>(new PassengerComparator());
    }

    public void joinLine(Passenger p) {
        passengers.add(p);
    }

    public void board() {
        while(!passengers.isEmpty()) {
            System.out.println(passengers.poll());
        }
    }
}
