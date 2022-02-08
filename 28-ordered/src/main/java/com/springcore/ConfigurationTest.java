package com.springcore;

import com.springcore.data.Car;
import com.springcore.processor.IdGeneratorBeanPostProcessor;

import com.springcore.processor.PrefixIdGeneratorBeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        Car.class,
        IdGeneratorBeanPostProcessor.class,
        PrefixIdGeneratorBeanPostProcessor.class
})
public class ConfigurationTest {
}
