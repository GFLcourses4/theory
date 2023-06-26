package decorator;

public class Main {
    public static void main(String[] args) {
        INotifier notifierOnAll = new ViberDecorator(new TelegramDecorator(new Notifier("katya")));
        notifierOnAll.send("Ваше замовлення прийнято! Очікуйте доставку");
        System.out.println("------------------------------------------------------------");

        INotifier notifierOnTelegram = new TelegramDecorator(new Notifier("dima"));
        notifierOnTelegram.send("Замовлення доставлене.");
        System.out.println("------------------------------------------------------------");

        INotifier notifier = new Notifier("anya");
        notifier.send("Замовлення схвалено!");
        System.out.println("------------------------------------------------------------");
    }
}
