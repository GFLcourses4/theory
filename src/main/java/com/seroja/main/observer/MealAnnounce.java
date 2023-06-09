package com.seroja.main.observer;

import java.util.*;

public class MealAnnounce implements Publisher {

    private final Map<String, List<Subscriber>> stages;

    public MealAnnounce() {
        this.stages = new HashMap<>();
        stages.put(String.valueOf(Stages.PLANNING), new ArrayList<>());
        stages.put(String.valueOf(Stages.COOKING), new ArrayList<>());
        stages.put(String.valueOf(Stages.READY), new ArrayList<>());
    }

    @Override
    public void subscribe(String stageName, Subscriber... subscribers) {
        stages.get(stageName).addAll(Arrays.stream(subscribers).toList());
    }

    @Override
    public void unsubscribe(String stageName, Subscriber subscriber) {
        stages.get(stageName).remove(subscriber);
    }


    @Override
    public void publish() {
        List<Subscriber> subscribersPlanning = stages.get(String.valueOf(Stages.PLANNING));
        publish(subscribersPlanning, "Planning message");
        List<Subscriber> subscribersCooking = stages.get(String.valueOf(Stages.COOKING));
        publish(subscribersCooking, "Cooking message");
        List<Subscriber> subscribersReady = stages.get(String.valueOf(Stages.READY));
        publish(subscribersReady, "Ready message");
    }

    private void publish(List<Subscriber> subscribers, String message) {
        subscribers.forEach(subscriber -> subscriber.receiveMessage(message));
    }
}
