package Week07.Queue;

public class MyQueue<T> {
    Node<T> head;
    Node<T> tail;

    public MyQueue() {}

    public void add(T value) {
        Node<T> node = new Node<T>(value);
        add(node);
    }

    public void add(Node<T> value) {
        if (head == null) {
            head = tail = value;
        } else {
            tail.setNext(value);
            value.setPrev(tail);
            tail = value;
        }
    }

    public T peek() {
        if (head == null) {
            throw new IllegalArgumentException("There's nothing in the Queue!"); 
        }
        return head.getValue();
    }

    public T poll() {
        if (head == null) {
            throw new IllegalArgumentException("There's nothing in the Queue!"); 
        }
        Node<T> removedNode = head;
        head = head.getNext();
        return removedNode.getValue();
    }

    @Override
    public String toString() {
        String str = "[";
        Node<T> currNode = head;
        while (currNode != null) {
            str += currNode.getValue();
            if (currNode.hasNext()) {
                str += ", ";
            }
            currNode = currNode.getNext();
        }
        str += "]";
        return str;
    }

    public static void main(String[] args) {
        MyQueue<String> strings = new MyQueue<>();
        strings.add("Me");
        strings.add("Myself");
        strings.add("and I");
        System.out.println("My strings\n" + strings);
        System.out.println("Peeking " + strings.peek());
        System.out.println("Polling " + strings.poll());
        System.out.println("My strings\n" + strings);
    }
}
