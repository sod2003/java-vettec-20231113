package Week10.FridayAssignment;

public class Bonus {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rufus", 7);
        Dog dog2 = new Dog("Spot", 9);
        Dog dog3 = new Dog("Snoopy", 8);
        Dog dog4 = new Dog("Fido", 6);
        Dog dog5 = new Dog("Rin Tin Tin", 10);
        Dog[] dogs = new Dog[] {dog1, dog2, dog3, dog4, dog5};
        Dog.quickSort(dogs);
        System.out.println("The cutest dogs, in order of cuteness:");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}

class Dog {
    String name;
    int cuteness;

    public Dog(String name, int cuteness) {
        this.name = name;
        this.cuteness = cuteness;
    }

    public String getName() {
        return name;
    }

    public int getCuteness() {
        return cuteness;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", cuteness=" + cuteness + "]";
    }

    public static void quickSort(Dog[] dogs) {
        quickSort(dogs, 0, dogs.length - 1);
    }

    public static void quickSort(Dog[] dogs, int begin, int end) {
        int pivot = partition(dogs, begin, end);

        if (begin < pivot - 1) {
            quickSort(dogs, begin, pivot - 1);
        }

        if (pivot < end) {
            quickSort(dogs, pivot, end);
        }
    }

    private static int partition(Dog[] arr, int begin, int end) {
        int i = begin, j = end;
        Dog tmp;
        Dog pivot = arr[(begin + end) / 2];

        while (i <= j) {
            while (arr[i].getCuteness() > pivot.getCuteness()) {
                i++;
            }

            while (arr[j].getCuteness() < pivot.getCuteness())
                j--;
                if (i <= j) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
            }
        }
        return i;
    }
}