package Week08.HashAndEquals;

public class HashCodeExample {
    public static void main(String[] args) {
        Company company = new Company();
        Occupation salesman = new Occupation();
        Person p = new Person("Bob", 65, salesman);
        Person p2 = new Person("Bob", 65, salesman);

        System.out.println(p == p2);
        System.out.println(p.equals(p2));

        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());
    }
}