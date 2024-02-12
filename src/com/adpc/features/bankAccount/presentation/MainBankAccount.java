package com.adpc.features.bankAccount.presentation;

import com.adpc.features.bankAccount.data.BankAccountDataRepository;
import com.adpc.features.bankAccount.domain.BankAccount;
import com.adpc.features.bankAccount.domain.CreateBankAccountUseCase;

public class MainBankAccount {

    public static void createBankAccount(){
        BankAccountDataRepository bankAccountDataRepository = (BankAccountDataRepository) BankAccountDataRepository.newInstance();
        CreateBankAccountUseCase createBankAccountUseCase = new CreateBankAccountUseCase(bankAccountDataRepository);
        createBankAccountUseCase.execute();
    }
}
