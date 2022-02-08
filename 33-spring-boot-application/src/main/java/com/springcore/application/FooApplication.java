package com.springcore.application;

import com.springcore.data.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FooApplication {

    // create application context or container spring
    public static void main(String[] args) {
        // run nama class aplikasi nya apa
        ConfigurableApplicationContext context = SpringApplication.run(FooApplication.class, args);

        // get bean Foo from context container
        Foo foo = context.getBean(Foo.class);
    }

    // create bean foo
    @Bean
    public Foo foo() {
        return new Foo();
    }
}
