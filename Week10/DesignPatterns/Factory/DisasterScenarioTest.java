package Week10.DesignPatterns.Factory;

import java.util.ArrayList;

public class DisasterScenarioTest {
    public static void main(String[] args) {
        ArrayList<Superhero> heros = new ArrayList<>();
        heros.add(new Superhero("Batman", "Rich", true));
        heros.add(new Superhero("Hulk", "Angry", false));
        SuperheroFactory hallOfHeros = new SuperheroFactory(heros);

        try{
            System.out.println("Disaster #1: " + hallOfHeros.getSuperhero());
            System.out.println("Disaster #2: " + hallOfHeros.getSuperhero());
        } catch (SuperheroException e) {
            System.out.println(e.getMessage());
        }
    }
}
