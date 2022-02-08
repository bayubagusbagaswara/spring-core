package com.springcore;

import com.springcore.data.Bar;
import com.springcore.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Configuration
@Slf4j
public class DependsOnConfiguration {

    // Bean foo akan dibuat setelah Bean bar selesai dibuat
    // dan bean Foo ini adalah Lazy, artinya tidak dibuat saat pertama kali aplikasi berjalan
    @Lazy
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
