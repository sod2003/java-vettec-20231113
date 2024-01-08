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

class Person {
    String name;
    String email;

    Person() {}

    Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }

    
}