package com.springcore;

import com.springcore.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {

    @Test
    void testCreateBean() {
        // create container ApplicationContext
        // dan masukkan class configuration yang ingin dimasukkan kedalam container
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Assertions.assertNotNull(applicationContext);
    }

    @Test
    void testGetBean() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        // get bean using getBean()
        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);

        Assertions.assertSame(foo1, foo2);
    }
}
