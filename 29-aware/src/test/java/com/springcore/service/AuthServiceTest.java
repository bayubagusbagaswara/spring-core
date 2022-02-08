package com.springcore.service;

import com.springcore.ConfigurationTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class AuthServiceTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ConfigurationTest.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testAware() {
        // get bean AuthService
        AuthService authService = applicationContext.getBean(AuthService.class);

        // harus sama antara name di AuthService, dan bean name authService dari container
        System.out.println(AuthService.class.getName());
        assertEquals(AuthService.class.getName(), authService.getBeanName());
        assertSame(applicationContext, authService.getApplicationContext());
    }
}