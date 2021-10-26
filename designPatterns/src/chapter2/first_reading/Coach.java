package chapter2.first_reading;

public interface Coach {
    void subscribe(Crew crew);
    void unsubscribe(Crew crew);
    void notifyCrew(String msg);
}
