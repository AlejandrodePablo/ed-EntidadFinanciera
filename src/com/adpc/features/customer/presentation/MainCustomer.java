package com.adpc.features.customer.presentation;

import com.adpc.features.customer.data.CustomerDataRepository;
import com.adpc.features.customer.domain.CreateCustomerUseCase;
import com.adpc.features.customer.domain.Customer;
import com.adpc.features.customer.domain.GetCustomerUseCase;

public class MainCustomer {

    public static void createCustomer() {
        CustomerDataRepository customerDataRepository = (CustomerDataRepository) CustomerDataRepository.newInstance();
        CreateCustomerUseCase createCustomerUseCase = new CreateCustomerUseCase(customerDataRepository);
        customerDataRepository.createCustomer();
    }
    public static void listCustomer(String dni){
        GetCustomerUseCase getCustomerUseCase = new GetCustomerUseCase(CustomerDataRepository.newInstance());
        Customer customer1 = getCustomerUseCase.execute(dni);
        System.out.println(customer1.toString());
    }
}
