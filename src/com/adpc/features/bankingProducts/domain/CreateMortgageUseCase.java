package com.adpc.features.bankingProducts.domain;

import com.adpc.features.bankAccount.domain.BankAccountRepository;

public class CreateMortgageUseCase {

    private BankingProductRepository bankingProductRepository;

    public CreateMortgageUseCase (BankingProductRepository bankingProductRepository){
        this.bankingProductRepository = bankingProductRepository;
    }

    public void execute(){
        bankingProductRepository.createMortgage();
    }
}