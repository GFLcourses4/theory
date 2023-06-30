package theory.tarasov.inheritancedecorator;

public class BaseMessage implements Message {
    private final String content;

    public BaseMessage(String content) {
        this.content = content;
    }

    @Override
    public void send() {
        System.out.println("Sending message: " + content);
    }
}
