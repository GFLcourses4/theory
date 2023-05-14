package com.vyrvykhvsot;

import com.vyrvykhvsot.builder.Account;

public class Main {
    public static void main(String[] args) {
        Account account1 =
                new Account.AccountBuilder("login", "passsword", 124L)
                        .build();
        System.out.println(account1);

        Account account2 =
                new Account.AccountBuilder("login2", "passsword2", 123L)
                        .build();
        System.out.println(account2);
    }
}
