package org.kinocat.builders.common;

import java.util.Objects;

public class RemoteUser extends LocalUser {
    private String domain;

    public RemoteUser(String login, String password, Long timestamp, String domain) {
        super(login, password, timestamp);
        this.domain = domain;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RemoteUser that = (RemoteUser) o;
        return Objects.equals(domain, that.domain);
    }

    @Override
    public String toString() {
        return "User{" +
                "domain='" + domain + '\'' +
                ", login='" + getLogin() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", timestamp=" + getTimestamp() +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), domain);
    }
}
