package Week07.Comparators;
import java.util.Comparator;

public class IqComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getIq() - p2.getIq();
    }
}
