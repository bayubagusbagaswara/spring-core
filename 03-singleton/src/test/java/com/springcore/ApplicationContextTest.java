package com.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    @Test
    void testApplicationContext() {

        // ApplicationContext berfungsi sebagai Container IoC nya Spring
        // misal nya class HelloWorld ini ingin kita masukkan kedalam container
        // sehingga nantinya class ini bisa dihandle oleh Spring
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        Assertions.assertNotNull(applicationContext);
    }
}
