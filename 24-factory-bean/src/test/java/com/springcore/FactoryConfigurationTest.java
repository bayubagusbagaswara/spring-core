package com.springcore;

import com.springcore.client.PaymentGatewayClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class FactoryConfigurationTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testFactory() {
        // get bean
        PaymentGatewayClient paymentGatewayClient = applicationContext.getBean(PaymentGatewayClient.class);

        assertNotNull(paymentGatewayClient);
        assertEquals("https://example.com", paymentGatewayClient.getEndpoint());
        assertEquals("private", paymentGatewayClient.getPrivateKey());
        assertEquals("public", paymentGatewayClient.getPublicKey());
    }
}