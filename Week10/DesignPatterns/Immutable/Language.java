package Week10.DesignPatterns.Immutable;

public class Language {
    private String language;

    public Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return language;
    }
}
