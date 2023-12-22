package Week06.Collections;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(null);
        ll.print();
        
        ll.add(new Node(1));
        ll.add(new Node(2));
        ll.add(new Node(3));
        ll.print();
    }
}
