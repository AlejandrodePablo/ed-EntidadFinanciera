package com.adpc.features.customer.domain;

public class CreateCustomerUseCase {

    private CustomerRepository customerRepository;

    public CreateCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute() {
        customerRepository.createCustomer();
    }
}
