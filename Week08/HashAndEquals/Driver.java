package Week08.HashAndEquals;

public class Driver {
    public static void main(String[] args) {
        Company stateFarm = new Company("State Farm", 7500, "abc10103");
        Company google = new Company("Google", 25000, "abd12123");
        Company google2 = new Company("Google", 25000, "abd12123");

        Occupation stateFarmSalesman = new Occupation("Salesman", stateFarm, 80000);
        Person matthew = new Person("Matthew", 26, stateFarmSalesman);
        Person sam = new Person("Sam", 21, stateFarmSalesman);
        Person matthew2 = new Person("Matthew", 26, stateFarmSalesman);
        System.out.println(matthew);
        System.out.println(sam);
        System.out.println(matthew.equals(sam));
        System.out.println(matthew.equals(matthew2));

        System.out.println(google.equals(google2));
        
        System.out.println(stateFarm.hashCode());
        System.out.println(google.hashCode());
        System.out.println(google2.hashCode());
    }
}
