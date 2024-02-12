package com.adpc.features.bankAccount.data;

import com.adpc.features.bankAccount.domain.BankAccount;
import com.adpc.features.bankAccount.domain.BankAccountRepository;
import com.adpc.features.customer.domain.Customer;


import java.util.ArrayList;

public class BankAccountDataRepository implements BankAccountRepository {
    @Override
    public void createBankAccount() {
        localBankAccount.add();
    }

    private static BankAccountRepository instance = null;
    private ArrayList<BankAccount> localBankAccount = new ArrayList<>();

    public static BankAccountRepository newInstance() {
        if (instance == null) {
            instance = new BankAccountDataRepository();
        }
        return instance;
    }

}

