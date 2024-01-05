package Week07.Athlete;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AthleteTests {
    public static void main(String[] args) {
        List<Athlete> athletes = new ArrayList<>(8);
        athletes.add(new Athlete("Jack Nicklaus", 75, 595));
        athletes.add(new Athlete("Lindsey Vonn", 82, 395));
        athletes.add(new Athlete("Mikaela Shiffrin", 82, 232));
        athletes.add(new Athlete("Novak Djokovic", 92, 280));
        athletes.add(new Athlete("Rafael Nadal", 92, 304));
        athletes.add(new Athlete("Roger Federer", 103, 367));
        athletes.add(new Athlete("Serena Williams", 73, 240));
        athletes.add(new Athlete("Tiger Woods", 82, 395));

        Collections.sort(athletes, new AthleteComparator().reversed());
        System.out.println(athletes);

        // Bonus
        List<Athlete> bonus = new ArrayList<>(2);
        bonus.add(new Athlete("Sean Carter", 1, 2));
        bonus.add(new Athlete("Mikaela Shiffrin", 82, 232));

        Collections.sort(bonus, new AthleteComparator().reversed());
        System.out.println(bonus);
    }
}
