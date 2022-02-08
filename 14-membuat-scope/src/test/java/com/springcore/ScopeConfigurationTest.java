package com.springcore;

import com.springcore.data.Bar;
import com.springcore.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ScopeConfigurationTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void testPrototypeScope() {

        // prototype artinya saat kita akses bean, maka akan dibuatkan bean yang baru
        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);
        Foo foo3 = applicationContext.getBean(Foo.class);

        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertNotSame(foo1, foo3);
        Assertions.assertNotSame(foo2, foo3);
    }

    @Test
    void testDoubletonScope() {

        Bar bar1 = applicationContext.getBean(Bar.class); // create bar1
        Bar bar2 = applicationContext.getBean(Bar.class); // create bar2
        Bar bar3 = applicationContext.getBean(Bar.class); // get bar1
        Bar bar4 = applicationContext.getBean(Bar.class); // get bar2

        Assertions.assertNotSame(bar1, bar2);
        Assertions.assertNotSame(bar3, bar4);
        Assertions.assertSame(bar1, bar3);
        Assertions.assertSame(bar2, bar4);
    }
}