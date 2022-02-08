package com.springcore.configuration;

import com.springcore.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    // kita akan menggunakan Bean untuk object dari class CustomerRepository
    // ada 2 bean dengan tipe yang sama
    // bisa ditambahkan Primary atau bisa @Qualifier pada class CustomerService
    @Bean
    public CustomerRepository normalCustomerRepository() {
        return new CustomerRepository();
    }

    @Bean
    public CustomerRepository premiumCustomerRepository() {
        return new CustomerRepository();
    }


}
