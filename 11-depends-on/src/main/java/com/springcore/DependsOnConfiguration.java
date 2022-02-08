package com.springcore;

import com.springcore.data.Bar;
import com.springcore.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@Slf4j
public class DependsOnConfiguration {

    // Bean foo akan dibuat setelah Bean bar selesai dibuat
    @Bean
    @DependsOn(value = {"bar"})
    public Foo foo() {
      log.info("Create new Foo");
      return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }
}
