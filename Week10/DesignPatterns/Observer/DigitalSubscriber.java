package Week10.DesignPatterns.Observer;

public class DigitalSubscriber implements Observer {
    
    @Override
    public void update(Object o) {
        System.out.println(toString() + o);
    }

    @Override
    public String toString() {
        return "DigitalSubscriber: ";
    }
}
