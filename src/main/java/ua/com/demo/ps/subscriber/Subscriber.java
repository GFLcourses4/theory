package ua.com.demo.ps.subscriber;

public interface Subscriber {

    void receiveMessage(String message, String from);

}