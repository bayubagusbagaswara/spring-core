package com.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    @Test
    void testApplicationContext() {

        // create ApplicationContext from Annotation based
        // ApplicationContext berfungsi sebagai Container IoC nya Spring
        // jadi membuat ApplicationContext dari class yang memiliki anotasi @Configuration
        // masukkan parameternya berupa class yang sudah kita beri anotasi @Configuration
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // pastikan applicationContext tidak null
        Assertions.assertNotNull(applicationContext);
    }
}
