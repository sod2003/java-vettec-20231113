package Week10.DesignPatterns.Immutable;
import java.util.ArrayList;
import java.util.List;

public class RosettaStone {
    private String text;
    private List<Language> languages;

    public RosettaStone(String text, List<Language> languages) {
        this.text = text;
        this.languages = copy(languages);
    }

    public String getText() {
        return text;
    }

    public List<Language> getLanguages() {
        List<Language> copy = new ArrayList<>();
        for(Language language : languages) {
            copy.add(language);
        }
        return copy;
    }

    private List<Language> copy(List<Language> target) {
        List<Language> copy = new ArrayList<>();
        for(Language language : target) {
            copy.add(language);
        }
        return copy;
    }
}
