package Week10.DesignPatterns.Observer;
import java.util.LinkedList;
import java.util.List;

public class NewsAgency {
    String news;
    List<Observer> subscribers = new LinkedList<>();

    public void setNews(String news) {
        for (Observer sub : subscribers) {
            this.news = news;
            System.out.println("Breaking News! " + news);
            sub.update(news);
        }
    }

    public void subscribe(Observer o) {
        subscribers.add(o);
    }
}
