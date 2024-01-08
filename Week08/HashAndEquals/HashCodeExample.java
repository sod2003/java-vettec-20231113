package Week08.HashAndEquals;

public class HashCodeExample {
    public static void main(String[] args) {
        Person p = new Person("Bob", "bobby@gmail.com");
        Person p2 = new Person("Bob", "bobby@email.com");

        System.out.println(p == p2);
        System.out.println(p.equals(p2));

        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());
    }
}