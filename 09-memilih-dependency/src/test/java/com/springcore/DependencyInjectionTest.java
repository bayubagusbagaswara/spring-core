package com.springcore;

import com.springcore.data.Bar;
import com.springcore.data.Foo;
import com.springcore.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    @Test
    void testDependencyInjection() {
        Foo foo = applicationContext.getBean(Foo.class);
        Foo fooSecond = applicationContext.getBean("fooSecond", Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertNotSame(foo, fooSecond);
        Assertions.assertSame(fooSecond, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }

}
