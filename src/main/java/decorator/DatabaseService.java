package decorator;

public class DatabaseService {

    public String getUserMail(String username) {
        return username + "@gmail.com";
    }

    public String getUserPhone(String username) {
        return "@" + username;
    }
}
