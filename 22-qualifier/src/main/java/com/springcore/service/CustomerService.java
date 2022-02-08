package com.springcore.service;

import com.springcore.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Getter
    private CustomerRepository normalCustomerRepository;

    @Getter
    private CustomerRepository premiumCustomerRepository;

    public CustomerService(
            @Qualifier("normalCustomerRepository") CustomerRepository normalCustomerRepository,
            @Qualifier("premiumCustomerRepository") CustomerRepository premiumCustomerRepository) {
        this.normalCustomerRepository = normalCustomerRepository;
        this.premiumCustomerRepository = premiumCustomerRepository;
    }
}
