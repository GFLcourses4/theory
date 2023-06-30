package theory.tarasov.inheritancedecorator;

abstract class MessageDecorator implements Message {
    final Message message;

    public MessageDecorator(Message message) {
        this.message = message;
    }
    @Override
    public void send() {
        message.send();
    }
}
