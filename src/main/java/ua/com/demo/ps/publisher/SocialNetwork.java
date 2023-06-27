package ua.com.demo.ps.publisher;

import ua.com.demo.ps.subscriber.Subscriber;

import java.util.*;

public class SocialNetwork implements Publisher {

    private static final String CHANNEL_MEMES = "@it_memes";
    private static final String CHANNEL_SCIENCE = "@veritasium";
    private static final String CHANNEL_PROGRAMMING = "@bobocode";


    Map<String, List<Subscriber>> network;


    public SocialNetwork() {
        this.network = new HashMap<>();
        this.network.put(CHANNEL_MEMES, new ArrayList<>());
        this.network.put(CHANNEL_SCIENCE, new ArrayList<>());
        this.network.put(CHANNEL_PROGRAMMING, new ArrayList<>());
    }



    @Override
    public void subscribe(String channelName, Subscriber... subscribers) {
        this.network.get(channelName).addAll(Arrays.stream(subscribers).toList());
    }

    @Override
    public void unsubscribe(String channelName, Subscriber subscriber) {
        this.network.get(channelName).remove(subscriber);
    }

    @Override
    public void publish() {
        List<Subscriber> memesSubscribers = this.network.get(CHANNEL_MEMES);
        publish(memesSubscribers, "Welcome on the best IT meme channel", CHANNEL_MEMES);

        List<Subscriber> scienceSubscribers = this.network.get(CHANNEL_SCIENCE);
        publish(scienceSubscribers, "Welcome on the best science channel", CHANNEL_SCIENCE);

        List<Subscriber> programmingSubscribers = this.network.get(CHANNEL_PROGRAMMING);
        publish(programmingSubscribers, "Welcome on the best programming channel", CHANNEL_PROGRAMMING);
    }


    private void publish(List<Subscriber> to, String message, String from) {
        to.forEach(subscriber -> subscriber.receiveMessage(message, from));
    }
}
