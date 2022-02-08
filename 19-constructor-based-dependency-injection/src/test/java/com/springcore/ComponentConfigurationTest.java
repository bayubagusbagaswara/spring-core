package com.springcore;

import com.springcore.repository.ProductRepository;
import com.springcore.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ComponentConfigurationTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testService() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);

        // atau bisa akses bean menggunakan nama bean nya
        ProductService productService2 = applicationContext.getBean("productService", ProductService.class);

        assertSame(productService1, productService2);
    }

    @Test
    void testConstructorDependencyInjection() {
        // get bean Product Service
        ProductService productService = applicationContext.getBean(ProductService.class);
        // get bean Product Repository
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        assertSame(productRepository, productService.getProductRepository());
    }
}