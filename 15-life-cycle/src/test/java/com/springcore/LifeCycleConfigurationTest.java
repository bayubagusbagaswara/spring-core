package com.springcore;

import com.springcore.data.Connection;
import com.springcore.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class LifeCycleConfigurationTest {

    // di ConfigurableApplicationContext memiliki function close()
    // fungsinya untuk menghancurkan applicationContext setalah tidak dipakai
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        // atau close secara otomatis
        applicationContext.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
        // applicationContext.close();
    }

    @Test
    void testConnection() {

        // get bean connection
        Connection connection = applicationContext.getBean(Connection.class);
    }

    @Test
    void testServer() {
        Server server = applicationContext.getBean(Server.class);
    }
}