package Week07.Athlete;

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