package Week07.Stack;

public class MyStack<T> {

    private Node<T> top;
    private int size;

    public MyStack() {}

    public void push(T item) {
        if (item == null) {
            throw new IllegalArgumentException("No null entries allowed!");
        }
        Node<T> newTop = new Node<T>(item);
        if (top != null) {
            newTop.setNext(top);
        }
        top = newTop;
        size++;
    }

    public T pop() {
        if (top == null) {
            throw new NullPointerException("There's no top!");
        }
        T data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return top.getData();
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String str = "[";
        Node<T> currNode = top;
        while (currNode != null) {
            str += currNode.getData();
            if (currNode.getNext() != null) {
                str += ", ";
            }
            currNode = currNode.getNext();
        }
        return str += "]";
    }
    
    public static void main(String[] args) {
        MyStack<Integer> ms = new MyStack<Integer>();
        System.out.println("Stack has size " + ms.getSize() + ".\n" + ms);
        ms.push(1);
        System.out.println("Stack has size " + ms.getSize() + ".\n" + ms);
        System.out.println("Stack's top data is " + ms.peek());
    }
}
