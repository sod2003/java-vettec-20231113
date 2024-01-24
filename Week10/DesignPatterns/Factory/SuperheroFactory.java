package Week10.DesignPatterns.Factory;
import java.util.ArrayList;
import java.util.List;

public class SuperheroFactory {
    List<Superhero> heros;

    public SuperheroFactory(List<Superhero> heros) {
        this.heros = new ArrayList<>(heros);
    }

    public Superhero getSuperhero() throws SuperheroException {
        for(Superhero hero : heros) {
            if(!hero.isOnTheCase()) {
                hero.setOnTheCase(true);
                return hero;
            }
        }
        throw new SuperheroException("There are no heros available to save the day.");
    }
}
