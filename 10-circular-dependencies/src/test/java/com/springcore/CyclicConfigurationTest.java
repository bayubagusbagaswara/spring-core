package com.springcore;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CyclicConfigurationTest {

    @Test
    void testCyclic() {
        // baru buat applicationContext aja sudah error
        // karena Spring sudah mendeteksi bahwa ada circular dependency

        assertThrows(Throwable.class, () -> {
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
        });
    }
}