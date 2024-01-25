package Week10.DesignPatterns.Observer;

public class PrintSubscriber implements Observer {
    
    @Override
    public void update(Object o) {
        System.out.println(toString() + o);
    }

    @Override
    public String toString() {
        return "PrintSubscriber: ";
    }
}
