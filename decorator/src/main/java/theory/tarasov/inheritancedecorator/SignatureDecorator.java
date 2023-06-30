package theory.tarasov.inheritancedecorator;

public class SignatureDecorator extends MessageDecorator {
    private final String signature;

    public SignatureDecorator(Message message, String signature) {
        super(message);
        this.signature = signature;
    }

    @Override
    public void send() {
        message.send();
        System.out.println("Adding signature: " + signature);
    }

}
