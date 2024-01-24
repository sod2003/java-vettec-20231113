package Week10.DesignPatterns.Immutable;
import java.util.ArrayList;
import java.util.List;

public class TestRosettaStone {
    public static void main(String[] args) {
        List<Language>  languages = new ArrayList<>();
        languages.add(new Language("English"));
        languages.add(new Language("French"));
        languages.add(new Language("Spanish"));
        RosettaStone stone = new RosettaStone("Hello! Bonjour! Hola!", languages);
        System.out.println(stone.getText());
        
        List<Language> copy = stone.getLanguages();
        RosettaStone stone2 = new RosettaStone("Hello! Bonjour! Hola!", copy);
        System.out.println(stone2.getText());
        System.out.println(stone.getLanguages() == stone2.getLanguages());
    }
}
