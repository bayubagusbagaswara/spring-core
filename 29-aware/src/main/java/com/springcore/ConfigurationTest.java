package com.springcore;

import com.springcore.service.AuthService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        AuthService.class
})
public class ConfigurationTest {
}
