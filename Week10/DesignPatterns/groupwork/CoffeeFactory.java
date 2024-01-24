package Week10.DesignPatterns.groupwork;
import java.util.ArrayList;
import java.util.List;

public class CoffeeFactory {

    List<Coffee> coffees;

    public CoffeeFactory(List<Coffee> coffees) {
        this.coffees = new ArrayList<>(coffees);
    }

    public Coffee orderCoffee(String coffeeType, String roastType) throws CoffeeException {
        System.out.println("So, you would like a(n) " + coffeeType + " with " + roastType + " beans?");
        for (Coffee coffee : coffees) {
            if (coffeeType.equalsIgnoreCase(coffee.getCoffeeType())
                    && roastType.equalsIgnoreCase(coffee.getRoast())) {
                System.out.println("Coming right up: your " + coffee.getCoffeeType() + " with " + coffee.getRoast()
                        + " roast!");
                return new Coffee(coffeeType, roastType);
            }
        }
        throw new CoffeeException("Sorry, we don't serve that here!");
    }
}