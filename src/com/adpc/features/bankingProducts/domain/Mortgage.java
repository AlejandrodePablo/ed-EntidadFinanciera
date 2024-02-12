package com.adpc.features.bankingProducts.domain;

public class Mortgage extends BankingProduct {

    private final String morgageId;
    private final String startDate;
    private final String finalDate;
    private final String interest;
    private final String amount;


    public Mortgage(String id, String name, String description, String morgageId, String startDate, String finalDate, String interest, String amount) {
        super(id, name, description);
        this.morgageId = morgageId;
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.interest = interest;
        this.amount = amount;
    }
}
