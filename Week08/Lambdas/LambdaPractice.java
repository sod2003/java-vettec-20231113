package Week08.Lambdas;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LambdaPractice {
    public static void main(String[] args) {
        LinkedList<City> cities = new LinkedList<>();
        cities.add(new City("Atlanta", 500000));
        cities.add(new City("Chicago", 700000));
        cities.add(new City("Boston", 600000));
        cities.add(new City("Seattle", 375000));

        System.out.println("Unsorted list of cities:");
        System.out.println(cities);
        Collections.sort(cities, new CityPopulationComparator());
        System.out.println("Sorted list of cities using CityPopulationComparator:");
        System.out.println(cities);
        
        //Using a lambda function to sort cities by name
        System.out.println("Sorted list of cities by name using lambda:");
        Collections.sort(cities, (city1, city2) -> city1.getName().compareTo(city2.getName()));
        System.out.println(cities);

        Comparator<City> cityNameReverseSorter = (city1, city2) -> {
            if(city1 == null || city1.getName() == null) {
                if(city2 == null || city2.getName() == null) {
                    return 0;
                }
                return 1;
            }
            if(city1.getName().charAt(0) > city2.getName().charAt(0)) {
                return -1;
            } else if(city1.getName() == city2.getName()) {
                return 0;
            }
            return 1;
        };

        //Using a lambda function to reverse sort cities by name
        System.out.println("Reverse sorted list of cities by name using variable-assigned lambda:");
        Collections.sort(cities, cityNameReverseSorter);
        System.out.println(cities);
    }
}
