package com.springcore;

import com.springcore.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class BeanNameConfigurationTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
    }

    @Test
    void testBeanName() {
        Foo foo = applicationContext.getBean(Foo.class); // foo bean primary
        Foo fooFirst = applicationContext.getBean("fooFirst", Foo.class); // fooFirst bean
        Foo fooSecond = applicationContext.getBean("fooSecond", Foo.class); // fooSecond bean

        assertSame(foo, fooFirst);
        assertNotSame(foo, fooSecond);
    }
}