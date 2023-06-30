package theory.tarasov.inheritancedecorator;

public class FormattingDecorator extends MessageDecorator {
    public FormattingDecorator(Message message) {
        super(message);
    }

    @Override
    public void send() {
        message.send();
        System.out.println("Applying additional formatting to the message");
    }
}
