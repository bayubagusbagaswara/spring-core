package com.springcore;

import com.springcore.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class PrimaryConfigurationTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);
    }

    @Test
    void testGetPrimary() {

        // bisa akses bean, tanpa perlu menyebutkan nama bean nya
        Foo foo = applicationContext.getBean(Foo.class); // foo1, karena Primary
        Foo foo1 = applicationContext.getBean("foo1", Foo.class);// ini juga bisa
        Foo foo2 = applicationContext.getBean("foo2", Foo.class);// ini juga bisa

        // foo must same foo1
        assertSame(foo, foo1);

        // foo must not same foo2
        assertNotSame(foo, foo2);

        // foo1 must not same foo2
        assertNotSame(foo1, foo2);
    }
}