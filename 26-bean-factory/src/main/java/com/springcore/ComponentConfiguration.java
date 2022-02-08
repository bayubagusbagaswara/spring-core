package com.springcore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.springcore.service",
        "com.springcore.repository",
        "com.springcore.configuration",
})
public class ComponentConfiguration {
}
