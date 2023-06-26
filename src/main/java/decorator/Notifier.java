package decorator;

public class Notifier implements INotifier{
    private final String username;
    private final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        this.databaseService = new DatabaseService();
    }


    @Override
    public void send(String message) {
        String email = databaseService.getUserMail(username);
        System.out.println(message + " -sent on Email to: " + email);
    }

    @Override
    public String getUsername() {
        return username;
    }
}
