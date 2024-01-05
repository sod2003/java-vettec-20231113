package Week07.Athlete;
import java.util.Comparator;

public class AthleteComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete o1, Athlete o2) {
        if (o1.getWins() > 30 && o2.getWins() > 30) {
            return (int) (o1.calculateWinRate() - o2.calculateWinRate());
        }
        return o1.getWins() - o2.getWins();
    }
}