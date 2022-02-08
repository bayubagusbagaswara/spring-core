package com.springcore;

import com.springcore.configuration.BarConfiguration;
import com.springcore.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
