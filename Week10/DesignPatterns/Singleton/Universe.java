package Week10.DesignPatterns.Singleton;

public class Universe {
    private int age = 0;
    private static final Universe instance = new Universe();

    private Universe() {}

    public static Universe getInstance() {
        return instance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
