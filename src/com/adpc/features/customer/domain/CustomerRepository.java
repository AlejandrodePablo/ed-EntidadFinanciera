package com.adpc.features.customer.domain;

public interface CustomerRepository {

    Customer obtainCustomer(String dni);

    void createCustomer();
}
