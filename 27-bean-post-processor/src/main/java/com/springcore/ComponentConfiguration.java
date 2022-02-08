package com.springcore;

import com.springcore.data.Car;
import com.springcore.processor.IdGeneratorBeanPostProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "com.springcore.service",
        "com.springcore.repository",
        "com.springcore.configuration",
})
@Import({Car.class, IdGeneratorBeanPostProcessor.class})
public class ComponentConfiguration {
}
