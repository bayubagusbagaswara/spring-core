package com.springcore;

import com.springcore.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicateBeanConfiguration {

    // Foo 1
    @Bean
    public Foo foo1() {
        Foo foo = new Foo();
        return foo;
    }

    // Foo 2
    @Bean
    public Foo foo2() {
        Foo foo = new Foo();
        return foo;
    }

}
