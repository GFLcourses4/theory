package com.vyrvykhvsot.dto;

import java.util.Objects;

public class AccountDto {
    private String login;
    private String password;
    private Long timestamp;

    public AccountDto() {}

    public AccountDto(String login, String password, Long timestamp) {
        this.login = login;
        this.password = password;
        this.timestamp = timestamp;
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
        AccountDto accountDto = (AccountDto) o;
        return Objects.equals(login, accountDto.login) &&
                Objects.equals(password, accountDto.password) &&
                Objects.equals(timestamp, accountDto.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, timestamp);
    }

    @Override
    public String toString() {
        return "AccountDto{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
