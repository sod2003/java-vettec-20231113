package Week08.Streams;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    // Does not mutate original data, but takes input from Collections and Arrays and transforms them.
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>(Arrays.asList("Apple", "Banana", "Pineapple", "Mango", "Kiwi", "Blueberry", "Pear", "Strawberry"));
        System.out.println(fruits);
        
        Stream<String> fruitStream = fruits.stream();
        fruitStream.forEach(fruit -> System.out.println(fruit));
        
        fruits.stream().map(fruit -> "Apple").forEach(fruit -> System.out.println(fruit));
        
        List<String> capitalizedFruits = fruits.stream().map(fruit -> fruit.toUpperCase()).collect(Collectors.toList());
        System.out.println(capitalizedFruits);
        System.out.println(fruits);
        
        List<String> fruitsThatBeginWithP = fruits.stream().filter(fruit -> fruit.toLowerCase().charAt(0) == 'p').collect(Collectors.toList());
        System.out.println(fruitsThatBeginWithP);
        
        List<String> berries = fruits
        .stream()
        .filter(fruit -> fruit.toLowerCase().contains("berry"))
        .collect(Collectors.toList());
        System.out.println(berries);
        
        List<Integer> numbers = new LinkedList<>();
        for(int i = 1; i <= 10; i++) numbers.add(i);
        int sumOfNumbers = numbers
            .stream()
            .reduce(0, (acc, number) -> acc + number);
        System.out.println(sumOfNumbers);
        
        int maxOfNumbers = numbers
            .stream()
            .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(maxOfNumbers);
        
        int max2 = numbers.stream().max(Integer::compare).get();
        System.out.println(max2);
    }
}
