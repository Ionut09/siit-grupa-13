package com.siit.strings.exampleATMDenisa;

import java.util.List;

public class User {

    private List<BankAccount> bankAccount;

    private String name;

    public User(String name, List<BankAccount> bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
    }
}
