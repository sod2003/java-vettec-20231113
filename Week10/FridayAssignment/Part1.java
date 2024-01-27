package Week10.FridayAssignment;
import java.util.HashMap;

public class Part1 {
    private static HashMap<String, String> alphabet;

    static {
        // initialize and fill
        alphabet = populateAlphabet();
    }

    public static String spellName(String name) {
        StringBuilder result = new StringBuilder();
        if (name != null && !name.isEmpty()) {
            for ( char c : name.toCharArray()) {
                String upperC = String.valueOf(c).toUpperCase();
                result.append(upperC + " as in " + alphabet.get(upperC) + "\n");
            }
        }
        return result.toString();
    }

    // Hint: You may use helper methods
    private static HashMap<String, String> populateAlphabet() {
        HashMap<String, String> alphabet = new HashMap<>();
        alphabet.put("A", "Alpha");
        alphabet.put("B", "Bravo");
        alphabet.put("C", "Charlie");
        alphabet.put("D", "Delta");
        alphabet.put("E", "Echo");
        alphabet.put("F", "Foxtrot");
        alphabet.put("G", "Golf");
        alphabet.put("H", "Hotel");
        alphabet.put("I", "India");
        alphabet.put("J", "Juliett");
        alphabet.put("K", "Kilo");
        alphabet.put("L", "Lima");
        alphabet.put("M", "Mike");
        alphabet.put("N", "November");
        alphabet.put("O", "Oscar");
        alphabet.put("P", "Papa");
        alphabet.put("Q", "Quebec");
        alphabet.put("R", "Romeo");
        alphabet.put("S", "Sierra");
        alphabet.put("T", "Tango");
        alphabet.put("U", "Uniform");
        alphabet.put("V", "Victor");
        alphabet.put("W", "Whiskey");
        alphabet.put("X", "X-ray");
        alphabet.put("Y", "Yankee");
        alphabet.put("Z", "Zulu");
        return alphabet;
    }

    public static void main(String[] args) {
        String sean = "Sean";
        System.out.println(spellName(sean));
    }
}
