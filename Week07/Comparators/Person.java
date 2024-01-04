package Week07.Comparators;

import java.util.Collections;
import java.util.LinkedList;

public class Person {
    private String name;
    private int age;
    private int iq;

    public Person(String name, int age, int iq) {
        this.name = name;
        this.age = age;
        this.iq = iq;
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

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + age + ", " + iq + "]";
    }
    
    public static void main(String[] args) {
        Person sally = new Person("Sally", 13, 135);
        Person jim = new Person("Jim", 67, 130);
        Person brad = new Person("Brad", 21, 113);

        LinkedList<Person> peopleList = new LinkedList<>();
        peopleList.add(sally);
        peopleList.add(jim);
        peopleList.add(brad);

        System.out.println(peopleList);
        
        Collections.sort(peopleList, new AgeComparator());
        System.out.println("Sorting by age");
        System.out.println(peopleList);
        
        Collections.sort(peopleList, new IqComparator());
        System.out.println("Sorting by IQ");
        System.out.println(peopleList);
    }
}
