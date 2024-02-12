package com.adpc.features.transaction.domain;

public class Transaction {

    private final String id;
    private final String amount;

    public Transaction(String id, String amount) {
        this.id = id;
        this.amount = amount;
    }
}
