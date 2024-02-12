package com.adpc.features.bankingProducts.presentation;

import com.adpc.features.bankingProducts.data.BankingProductDataRepository;
import com.adpc.features.bankingProducts.domain.CreateMortgageUseCase;
import com.adpc.features.bankingProducts.domain.Mortgage;

public class MainBankingProduct {

    public static void execute() {
        BankingProductDataRepository bankingProductDataRepository = (BankingProductDataRepository) BankingProductDataRepository.newInstance();
        CreateMortgageUseCase createMortgageUseCase = new CreateMortgageUseCase(bankingProductDataRepository);
        createMortgageUseCase.execute();

    }
}
