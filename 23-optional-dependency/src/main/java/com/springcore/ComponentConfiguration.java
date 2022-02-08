package com.springcore;

import com.springcore.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "com.springcore.service",
        "com.springcore.repository",
        "com.springcore.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
