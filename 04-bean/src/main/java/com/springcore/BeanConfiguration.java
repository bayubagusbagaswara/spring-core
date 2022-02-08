package com.springcore;

import com.springcore.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    // create method Bean name foo(), return value is object foo
    // add annotation @Bean,
    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        return foo;
    }

}
