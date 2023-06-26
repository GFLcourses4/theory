package decorator;

public class TelegramDecorator extends BaseNotifierDecorator{
    public TelegramDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public void send(String message){
        super.send(message);
        String phone = databaseService.getUserPhone(getUsername());
        System.out.println(message + " -send on Telegram to: " + phone);
    }
}
