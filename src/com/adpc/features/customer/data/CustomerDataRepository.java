package com.adpc.features.customer.data;

import com.adpc.features.customer.domain.Customer;
import com.adpc.features.customer.domain.CustomerRepository;

import java.util.ArrayList;

public class CustomerDataRepository implements CustomerRepository {
    @Override
    public Customer obtainCustomer(String dni) {
        for (Customer customer : localCustomer) {
            if (customer.getDni().equals(dni)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void createCustomer() {
        localCustomer.add();
    }

    public static CustomerRepository instance = null;
    private ArrayList<Customer> localCustomer = new ArrayList<>();

    public static CustomerRepository newInstance() {
        if (instance == null) {
            instance = new CustomerDataRepository();
        }
        return instance;
    }

    public void initData() {
        localCustomer.add(new Customer("123456789A", "Alejandro", "dePablo", "Avila", "C/Calle-Nº1", "05230"));
        localCustomer.add(new Customer("987654321B", "Rodrigo", "Diaz", "Madrid", "C/Avenida-Nº2", "05230"));
    }
}
