package Week07.Comparators;

public class FlightTest {
    public static void main(String[] args) {
        Flight a = new Flight();
        a.joinLine(new Passenger("Rod", 1));
        a.joinLine(new Passenger("Sam", 2));
        a.joinLine(new Passenger("Sean", 1));
        a.board();
    }
}
