package Week10.DesignPatterns.groupwork;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFactory {
    public static void main(String[] args) {
        List<Coffee> menu = new ArrayList<>(
                Arrays.asList(
                        new Coffee("Capuccino", "medium"),
                        new Coffee("Espresso", "dark"),
                        new Coffee("Americano", "light")));

        CoffeeFactory starbucks = new CoffeeFactory(menu);

        try {
            starbucks.orderCoffee("espresso", "dark");
            starbucks.orderCoffee("Americano", "dark");
        } catch (CoffeeException e) {
            System.out.println(e.getMessage());
        }
    }
}
