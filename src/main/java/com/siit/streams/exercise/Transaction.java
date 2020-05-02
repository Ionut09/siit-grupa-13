package com.siit.streams.exercise;

import lombok.Data;

@Data
public class Transaction {

    private final Trader trader;

    private final int value;

    private final int year;
}
