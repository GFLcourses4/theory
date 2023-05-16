package builder;

public class UserBuilder implements Builder{
    private String login;
    private String password;
    private Long timestamp;
    @Override
    public void login(String login) {
        this.login = login;
    }

    @Override
    public void password(String password) {
        this.password = password;
    }

    @Override
    public void timestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public User build() {
        return new User(login, password, timestamp);
    }
}
