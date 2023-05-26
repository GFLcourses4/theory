package org.kinocat.builders.common;

public abstract class AbstractBuilder<T> implements Builder {

    String login;
    String password;
    Long timestamp;

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

    public abstract T getResult();
}
