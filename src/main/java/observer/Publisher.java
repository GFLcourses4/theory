package observer;

public interface Publisher {
    void subscribe(String courseName, Subscriber student);
    void unsubscribe(String courseName, Subscriber student);
    void publishMessage();
}
