package com.adpc.features.transaction.domain;

public class CreateTransactionUseCase {

    private TransactionRepository transactionRepository;

    public CreateTransactionUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void execute() {
        transactionRepository.createTransaction();
    }
}
