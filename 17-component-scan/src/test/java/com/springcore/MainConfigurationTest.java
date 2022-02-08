package com.springcore;

import com.springcore.data.Bar;
import com.springcore.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class MainConfigurationTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        // MainConfiguration import FooConfiguration and BarConfiguration
        applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testImport() {
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
    }
}