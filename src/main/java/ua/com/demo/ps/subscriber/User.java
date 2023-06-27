package ua.com.demo.ps.subscriber;

public class User implements Subscriber {

    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void receiveMessage(String message, String from) {
        System.out.printf("%s, you have a new message from %s:\n\t%s\n", this.username, from, message);
    }
}
