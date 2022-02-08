package com.springcore.service;

import com.springcore.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    // constructor based dependency injection
    // @Autowired untuk memilih constructor utama nya
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // ERROR, harus pilih salah satu constructor
    public ProductService(ProductRepository productRepository, String name) {
        this.productRepository = productRepository;
    }
}
