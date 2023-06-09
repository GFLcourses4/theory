package com.seroja.main.observer;

public interface Subscriber {

    void receiveMessage(String message);
    String getSubscriberId();

}
