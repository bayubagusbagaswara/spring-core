package com.springcore.application;

import com.springcore.data.Bar;
import com.springcore.data.Foo;
import com.springcore.listener.AppStartingListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FooApplication {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(FooApplication.class);

        application.setBannerMode(Banner.Mode.OFF);
        // set listener
        application.setListeners(List.of(new AppStartingListener()));

        ConfigurableApplicationContext applicationContext = application.run(args);
        Foo foo = applicationContext.getBean(Foo.class);
    }

    @Bean
    public Foo foo() {
        return new Foo();
    }
}
