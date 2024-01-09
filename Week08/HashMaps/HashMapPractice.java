package Week08.HashMaps;
import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("accuracy", "the condition or quality of being true, correct, or exact; freedom from error or defect; precision or exactness; correctness.");
        dictionary.put("precision", "accuracy; exactness: ");
        dictionary.put("faultless", "without fault, flaw, or defect; perfect.");
        System.out.println(dictionary);
        
        dictionary.put(null, null);
        dictionary.replace(null, "Not Specified");
        System.out.println(dictionary.get(null));
    }
}