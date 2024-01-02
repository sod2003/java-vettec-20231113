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

    public int getSize() {
        return size;
    }
    
    public static void main(String[] args) {
        MyStack<Integer> ms = new MyStack();
        System.out.println("Stack has size " + ms.getSize());
        ms.push(1);
        System.out.println("Stack has size " + ms.getSize());
        System.out.println("Stack's top data is " + ms.pop());
    }
}
