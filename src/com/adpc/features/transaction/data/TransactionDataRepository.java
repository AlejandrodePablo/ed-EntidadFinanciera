package com.adpc.features.transaction.data;

import com.adpc.features.transaction.domain.Transaction;
import com.adpc.features.transaction.domain.TransactionRepository;

import java.util.ArrayList;

public class TransactionDataRepository implements TransactionRepository {

    @Override
    public void createTransaction() {
        localTransaction.add();
    }

    private static TransactionDataRepository instance = null;

    public ArrayList<Transaction> localTransaction = new ArrayList<>();

    private TransactionDataRepository() {
        initData();
    }

    public static TransactionRepository newInstance() {
        if (instance == null) {
            instance = new TransactionDataRepository();
        }
        return instance;
    }

    public void initData() {
        localTransaction.add(new Transaction("1", "2500"));
        localTransaction.add(new Transaction("2", "-200"));
    }
}
