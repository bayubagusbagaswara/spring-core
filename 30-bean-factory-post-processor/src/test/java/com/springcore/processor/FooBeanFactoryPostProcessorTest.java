package com.springcore.processor;

import com.springcore.ConfigurationTest;
import com.springcore.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class FooBeanFactoryPostProcessorTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ConfigurationTest.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testBeanFactoryPostProcessor() {

        // get bean foo from applicaton context
        Foo foo = applicationContext.getBean(Foo.class);

        // kita sudah meregistrasikan bean Foo menggunakan BeanFactoryPostProcessor
        // jadi tidak melalui BeanFactory secara langsung
        assertNotNull(foo);
    }
}