package Week09.TuesdayAssignment;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Person {
    private String name;
    private LocalDate DOB;

    public Person(String name, LocalDate DOB) {
        this.name = name;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate dOB) {
        DOB = dOB;
    }

    @Override
    public String toString() {
        //DateTimeFormatter.ofPattern("MMM dd, yyyy") is the alternative way to do the date format
        return "" + name + " born " + DOB.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) + " is " + getAge() + " years old";
    }

    public int getAge() {
        return (int) DOB.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public static void main(String[] args) {
        Person sean = new Person("Sean", LocalDate.of(1985, 6, 16));
        System.out.println(sean);
    }
}
