package com.springcore.application;

import com.springcore.data.Bar;
import com.springcore.data.Foo;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FooApplication {

    public static void main(String[] args) {
        // create Spring Application
        SpringApplication application = new SpringApplication(FooApplication.class);

        // banner off
        application.setBannerMode(Banner.Mode.OFF);

        // create application context
        ConfigurableApplicationContext applicationContext = application.run(args);

        // get bean Foo class
        Foo foo = applicationContext.getBean(Foo.class);
    }

    @Bean
    public Foo foo() {
        return new Foo();
    }
}
