package singleton;

import java.util.Objects;

public class UserLazyInitialization {
    private String login;
    private String password;
    private Long timestamp;

    private static UserLazyInitialization instance = null;

    private UserLazyInitialization(String login, String password, Long timestamp) {
        this.login = login;
        this.password = password;
        this.timestamp = timestamp;
    }

    public static UserLazyInitialization getInstance(String login, String password, Long timestamp){
        if(instance == null){
            instance = new UserLazyInitialization(login, password, timestamp);
        }
        return instance;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLazyInitialization user = (UserLazyInitialization) o;
        return Objects.equals(getLogin(), user.getLogin())
                && Objects.equals(getPassword(), user.getPassword())
                && Objects.equals(getTimestamp(), user.getTimestamp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getPassword(), getTimestamp());
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
