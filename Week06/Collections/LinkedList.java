package Week06.Collections;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(Node head) {
        this.head = head;
        tail = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
            return tail;
        }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void add(Node node) {
        if(tail != null) {
            tail.setNext(node);
            tail = tail.getNext();
        } else {
            head = node;
            tail = node;
        }
    }

    public void print() {
        if(head != null) {
            Node node = head;
            while(node != null) {
                System.out.println("Node: " + node);
                node = node.getNext();
            }
        } else {
            System.out.println("This Linked List is empty.");
        }
    }
}
