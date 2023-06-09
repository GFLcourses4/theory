package com.seroja.main.observer;

public interface Publisher {

    void subscribe(String stageName, Subscriber... subscribers);
    void unsubscribe(String stageName, Subscriber subscriber);
    void publish();

}
