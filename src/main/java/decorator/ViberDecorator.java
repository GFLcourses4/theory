package decorator;

public class ViberDecorator extends BaseNotifierDecorator{
    public ViberDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public void send(String message){
        super.send(message);
        String phone = databaseService.getUserPhone(getUsername());
        System.out.println(message + " -send on Viber to: " + phone);
    }
}
