package com.springcore;

import com.springcore.configuration.OptionalConfiguration;
import com.springcore.data.Foo;
import com.springcore.data.FooBar;
import com.springcore.data.MultiFoo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class OptionalConfigurationTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testOptional() {
        // get bean Foo
        Foo foo = applicationContext.getBean(Foo.class);

        // get bean FooBar
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        assertNull(fooBar.getBar());
        assertSame(foo, fooBar.getFoo());
    }

    @Test
    void testObjectProvider() {
        MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);
        assertEquals(4, multiFoo.getFoos().size());
    }
}