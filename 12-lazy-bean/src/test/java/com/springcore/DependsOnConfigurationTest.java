package com.springcore;

import com.springcore.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class DependsOnConfigurationTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void testDependsOn() {

        // saat kita getBean Foo, maka bean Foo baru dibuat, inilah sifat bean Lazy
        Foo fo = applicationContext.getBean(Foo.class);

    }
}