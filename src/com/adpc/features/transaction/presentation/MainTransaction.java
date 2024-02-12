package com.adpc.features.transaction.presentation;

import com.adpc.features.transaction.data.TransactionDataRepository;
import com.adpc.features.transaction.domain.CreateTransactionUseCase;
import com.adpc.features.transaction.domain.Transaction;

public class MainTransaction {

    public static void createTransaction() {
        TransactionDataRepository transactionDataRepository = (TransactionDataRepository) TransactionDataRepository.newInstance();
        CreateTransactionUseCase createTransactionUseCase = new CreateTransactionUseCase(transactionDataRepository);
        createTransactionUseCase.execute();
    }
}
