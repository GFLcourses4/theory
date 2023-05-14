package com.vyrvykhvsot.builder;

public class Account {
    private final String login;
    private final String password;
    private final Long timestamp;

    private Account(AccountBuilder builder) {
        this.login = builder.login;
        this.password = builder.password;
        this.timestamp = builder.timestamp;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Account{" +
                "login='" + this.login + '\'' +
                ", password='" + this.password + '\'' +
                ", timestamp=" + this.timestamp +
                '}';
    }

    public static class AccountBuilder {
        private final String login;
        private final String password;
        private final Long timestamp;

        public AccountBuilder(String login, String password, Long timestamp) {
            this.login = login;
            this.password = password;
            this.timestamp = timestamp;
        }

        public Account build() {
            Account account = new Account(this);
            return account;
        }
    }
}
