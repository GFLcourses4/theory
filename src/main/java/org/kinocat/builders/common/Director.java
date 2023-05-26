package org.kinocat.builders.common;

public class Director {

    private void createUser(Builder builder, String login, String password) {
        builder.login(login);
        builder.password(password);
        builder.timestamp(System.currentTimeMillis());
    }

    public void createDefaultUser(Builder builder) {
        createUser(builder, "default", "default");
    }

    public void createAnonymousUser(Builder builder) {
        createUser(builder, "anonymous", "");
    }
}