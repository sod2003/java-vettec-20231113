package Week09.TuesdayAssignment;
import java.time.LocalDate;
import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }

    public static void main(String[] args) {
        Person jim = new Person("Jim", LocalDate.of(1990, 2, 11));
        Person susie = new Person("Susie", LocalDate.of(1990, 2, 11));
        AgeComparator ac = new AgeComparator();
        System.out.println("Is Jim older than Susie? " + ac.compare(jim, susie));
        
        Person paul = new Person("Jim", LocalDate.of(1980, 3, 15));
        System.out.println("Is Jim older than Paul? " + ac.compare(jim, paul));
    }
}
