package com.siit.io;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BankAccount implements Serializable {

    private static final long serialVersionUID = -82712719271991L;

    private String bank;

    private transient String iban;

    private double balance;

    public BankAccount() {
        balance = 500;
    }
}


