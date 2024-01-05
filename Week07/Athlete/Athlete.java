package Week07.Athlete;
import java.util.Comparator;

public class Athlete {
    private String name;
    private int wins;
    private int events;

    public Athlete(String name, int wins, int events) {
        this.name = name;
        this.wins = wins;
        this.events = events;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getEvents() {
        return events;
    }

    public void setEvents(int events) {
        this.events = events;
    }

    public double calculateWinRate() {
        return (wins / (double) events) * 100;
    }

    @Override
    public String toString() {
        return String.format("%s, Wins: %d, Totals Games: %d, Win Rate: %.2f%s", name, wins, events, calculateWinRate(), "%"); 
    }
}

class AthleteComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete o1, Athlete o2) {
        if (o1.getWins() > 30 && o2.getWins() > 30) {
            return (int) (o1.calculateWinRate() - o2.calculateWinRate());
        }
        return o1.getWins() - o2.getWins();
    }
}