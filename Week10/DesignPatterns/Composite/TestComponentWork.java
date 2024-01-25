package Week10.DesignPatterns.Composite;

public class TestComponentWork {
    public static void main(String[] args) {
        Branch root = new Branch(3);
        Branch b1 = new Branch(7);
        Branch b2 = new Branch(2);

        Leaf l1 = new Leaf(11);
        Leaf l2 = new Leaf(10);

        root.add(b1);
        root.add(b2);

        b1.add(l1);
        b2.add(l2);

        System.out.println(root);
    }
}
