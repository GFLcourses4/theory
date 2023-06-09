package com.seroja.main.observer;

public class SubscriberCookingImpl implements Subscriber {
    @Override
    public void receiveMessage(String message) {
        System.out.printf("Reading message - %s by subscriber id -%s%n", message, getSubscriberId());
    }

    @Override
    public String getSubscriberId() {
        return "Subscriber cooking";
    }
}
