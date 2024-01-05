package Week07.Comparators;
import java.util.Comparator;

public class PassengerComparator implements Comparator<Passenger> {

    @Override
    public int compare(Passenger o1, Passenger o2) {
        return o1.group - o2.group;
    }
}
