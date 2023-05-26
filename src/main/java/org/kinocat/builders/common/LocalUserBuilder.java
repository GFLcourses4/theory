package org.kinocat.builders.common;

public class LocalUserBuilder extends AbstractBuilder<LocalUser> {

    @Override
    public LocalUser getResult() {
        return new LocalUser(login, password, timestamp);
    }
}