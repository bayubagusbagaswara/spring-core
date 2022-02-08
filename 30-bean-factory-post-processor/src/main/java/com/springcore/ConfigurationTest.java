package com.springcore;

import com.springcore.processor.FooBeanFactoryPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooBeanFactoryPostProcessor.class
})
public class ConfigurationTest {
}
