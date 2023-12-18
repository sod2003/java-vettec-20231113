package Week06.ConstructorChaining;

public class Dog extends Animal{
    String color;
    String size;

    public Dog(String name, String color, int age, String size) {
        super(name, age);
        this.color = color;
        this.size = size;
    }
}
