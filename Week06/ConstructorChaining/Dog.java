package Week06.ConstructorChaining;

public class Dog extends Animal{
    String color;
    String size;

    public Dog(String name, String color, int age, String size) {
        super(name, age);
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("The dog is named %s. He is %s, %s sized, and %d years old.", name, color, size, age);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Spot", "Black and White", 2, "Medium");
        System.out.println(dog);
    }
}
