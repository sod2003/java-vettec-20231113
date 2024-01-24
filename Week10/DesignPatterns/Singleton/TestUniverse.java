package Week10.DesignPatterns.Singleton;

public class TestUniverse {
    public static void main(String[] args) {
        Universe universe = Universe.getInstance();
        Universe universe2 = Universe.getInstance();

        System.out.println(universe == universe2);
        
        LazyUniverse lazyU = LazyUniverse.getLazyUniverse();
        lazyU.incrementAge(2);
        LazyUniverse lazyU2 = LazyUniverse.getLazyUniverse();
        System.out.println(lazyU.getAge() == lazyU2.getAge());
    }
}
