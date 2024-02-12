package com.adpc.features.bankAccount.domain;

public class CreateBankAccountUseCase {

    private BankAccountRepository bankAccountRepository;

    public CreateBankAccountUseCase(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public void execute() {
        bankAccountRepository.createBankAccount();
    }
}
