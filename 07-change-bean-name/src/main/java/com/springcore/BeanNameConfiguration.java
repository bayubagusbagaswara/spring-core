package com.springcore;

import com.springcore.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanNameConfiguration {

    // Bean Foo1 name change to fooFirst
    @Primary
    @Bean(name = "fooFirst")
    public Foo foo1() {
        return new Foo();
    }

    // Bean Foo1 name change to fooSecond
    @Bean(name = "fooSecond")
    public Foo foo2() {
        return new Foo();
    }
}
