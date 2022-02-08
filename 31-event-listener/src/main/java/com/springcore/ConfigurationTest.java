package com.springcore;

import com.springcore.listener.LoginSuccessListener;
import com.springcore.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        UserService.class,
        LoginSuccessListener.class
})
public class ConfigurationTest {
}
