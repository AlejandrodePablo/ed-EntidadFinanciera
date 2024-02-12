package com.adpc.features.bankingProducts.data;

import com.adpc.features.bankingProducts.domain.BankingProductRepository;
import com.adpc.features.bankingProducts.domain.Mortgage;

import java.util.ArrayList;

public class BankingProductDataRepository implements BankingProductRepository {

    @Override
    public void createMortgage() {
        localMortgage.add();
    }

    private static BankingProductRepository instance = null;
    private ArrayList<Mortgage> localMortgage = new ArrayList<>();

    public static BankingProductRepository newInstance(){
        if(instance == null){
            instance = new BankingProductDataRepository();
        }
        return instance;
    }

    public void initData(){
        localMortgage.add(new Mortgage("1", "Hipoteca3000","Hipoteca_Piso1", "01","11/02/2024","14/02/2054","5%","250000"));
    }
}
