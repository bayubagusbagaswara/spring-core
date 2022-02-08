package com.springcore;

import com.springcore.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryConfiguration {

    // Foo 1 as Primary
    @Primary
    @Bean
    public Foo foo1() {
        return new Foo();
    }

    // Foo 2
    @Bean
    public Foo foo2() {
        return new Foo();
    }
}
