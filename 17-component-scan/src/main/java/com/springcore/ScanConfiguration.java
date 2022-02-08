package com.springcore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.springcore.configuration"
})
public class ScanConfiguration {
}
