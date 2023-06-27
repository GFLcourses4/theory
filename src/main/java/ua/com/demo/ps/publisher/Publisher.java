package ua.com.demo.ps.publisher;

import ua.com.demo.ps.subscriber.Subscriber;

public interface Publisher {

    void subscribe(String channelName, Subscriber... subscribers);

    void unsubscribe(String channelName, Subscriber subscriber);

    void publish();

}
