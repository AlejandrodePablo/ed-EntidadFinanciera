package com.adpc.features.customer.domain;

public class GetCustomerUseCase {

    private CustomerRepository customerRepository;

    public GetCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer execute(String dni) {
        return customerRepository.obtainCustomer(dni);
    }
}

