package com.springcore;

import com.springcore.data.Bar;
import com.springcore.data.Foo;
import com.springcore.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Slf4j
public class ScopeConfiguration {

    @Bean
    @Scope(scopeName = "prototype")
    public Foo foo() {
      log.info("Create new Foo");
      return new Foo();
    }

    // CustomScopeConfigurer untuk mendaftarkan scope yang baru kita buat
    @Bean
    public CustomScopeConfigurer customeScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope(scopeName = "doubleton")
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }
}
