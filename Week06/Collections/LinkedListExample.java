package Week06.Collections;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {
    
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        System.out.println(fruits);
        
        fruits.add("apples");
        fruits.add("bananas");
        System.out.println(fruits);
        
        fruits.add(1 ,"strawberries");
        fruits.addLast("apples");
        System.out.println(fruits);
        
        fruits.remove("strawberries");
        fruits.removeAll(Arrays.asList("apples"));
        System.out.println(fruits);

    }

}
