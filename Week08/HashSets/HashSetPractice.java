package Week08.HashSets;
import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> cookies = new HashSet<>();
        cookies.add("Chocolate Chip");
        cookies.add("Snicker Doodle");
        cookies.add("Ginger Snap");
        System.out.println(cookies);
        
        System.out.println(cookies.size());
        cookies.remove("Ginger Snap");
        System.out.println(cookies);
        System.out.println(cookies.size());
    }
}
