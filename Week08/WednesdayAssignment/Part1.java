package Week08.WednesdayAssignment;

import java.util.HashMap;

    public class Part1 {
        public static HashMap<Character, Integer> countLetters(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : str.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                if(hm.containsKey(c)) {
                    hm.put(c, hm.get(c) + 1);
                } else {
                    hm.put(c, 1);
                }
            }
        }
        return hm;
    }

    public static void main(String[] args) {
        String sentence1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println(sentence1 + "\n" + countLetters(sentence1));
        String sentence2 = "Testing 1 2 3 4 ... testing 1 2 3 4";
        System.out.println(sentence2 + "\n" + countLetters(sentence2));
    }
}
