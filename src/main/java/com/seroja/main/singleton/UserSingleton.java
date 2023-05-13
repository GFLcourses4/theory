package com.seroja.main.singleton;

public class UserSingleton {

    private static UserSingleton instance;
    private String login;
    private String password;
    private Long timestamp;

    public UserSingleton(String login, String password, Long timestamp) {
        this.login = login;
        this.password = password;
        this.timestamp = timestamp;
    }
    public static UserSingleton getInstance(String login, String password, Long timestamp) {
        if (instance == null) {
            instance = new UserSingleton(login, password, timestamp);
        }
        return instance;
    }
}
