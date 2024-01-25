package Week10.DesignPatterns.Observer;

public class TestNewsAgency {
    public static void main(String[] args) {
        NewsAgency skillstormNews = new NewsAgency();
        skillstormNews .subscribe(new PrintSubscriber());
        skillstormNews.subscribe(new PrintSubscriber());
        skillstormNews.subscribe(new DigitalSubscriber());
        skillstormNews.subscribe(new DigitalSubscriber());

        skillstormNews.setNews("Observer pattern is in!");
    }
}
