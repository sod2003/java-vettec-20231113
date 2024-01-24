package Week10.DesignPatterns.Singleton;

public class LazyUniverse {
    private int age = 0;
    private static LazyUniverse instance;

    private LazyUniverse() {}

    public static LazyUniverse getLazyUniverse() {
        if(instance == null) instance = new LazyUniverse();
        return instance;
    }

    public int getAge() {
        return age;
    }

    public synchronized void incrementAge(int age) {
        this.age += age;
    }
}
