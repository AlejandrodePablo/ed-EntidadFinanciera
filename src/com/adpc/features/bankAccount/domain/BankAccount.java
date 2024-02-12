package com.adpc.features.bankAccount.domain;

import com.adpc.features.customer.domain.Customer;
import com.adpc.features.transaction.domain.Transaction;

import java.util.ArrayList;

public class BankAccount {

    private final String accountNumber;
    private final Customer customer;
    private final Transaction transaction;
    private final String contractedProducts;
    private final String balance;

    public BankAccount(String accountNumber, Customer customer, Transaction transaction, String contractedProducts, String balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.transaction = transaction;
        this.contractedProducts = contractedProducts;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public String getContractedProducts() {
        return contractedProducts;
    }

    public String getBalance() {
        return balance;
    }
}
