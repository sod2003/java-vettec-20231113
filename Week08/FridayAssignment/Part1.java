package Week08.FridayAssignment;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Part1 {
    public static void main(String[] args) {
        List<Pet> pets1 = new LinkedList<>(Arrays.asList(new Pet("Midnight", 3), new Pet("Cotton", 2)));
        Person sally = new Person("Sally", pets1);
        List<Pet> pets2 = new LinkedList<>(Arrays.asList(new Pet("Rascal", 5)));
        Person frank = new Person("Frank", pets2);
        List<Pet> pets3 = new LinkedList<>(Arrays.asList(new Pet("Tater", 6), new Pet("Mustafa", 11), new Pet("Mr. Cheeks", 7)));
        Person linda = new Person("Linda", pets3);
        List<Person> peopleWithPets = new LinkedList<>(Arrays.asList(sally, frank, linda));

        mostPets(peopleWithPets);
    }

    public static void mostPets(List<Person> petOwners) {
        int max = petOwners.stream().map((person) -> person.getPets().size()).reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max + " pets");
    }
}

class Person {
    private String name;
    private List<Pet> pets;

    public Person(String name, List<Pet> pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", pets=" + pets + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((pets == null) ? 0 : pets.hashCode());
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
        if (pets == null) {
            if (other.pets != null)
                return false;
        } else if (!pets.equals(other.pets))
            return false;
        return true;
    }
}

class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
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
        Pet other = (Pet) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }
}