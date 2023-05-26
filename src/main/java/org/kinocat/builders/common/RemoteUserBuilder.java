package org.kinocat.builders.common;

public class RemoteUserBuilder extends AbstractBuilder<RemoteUser> {
    private String domain;

    void domain(String domain) {
        this.domain = domain;
    }

    @Override
    public RemoteUser getResult() {
        return new RemoteUser(login, password, timestamp, domain);
    }
}
