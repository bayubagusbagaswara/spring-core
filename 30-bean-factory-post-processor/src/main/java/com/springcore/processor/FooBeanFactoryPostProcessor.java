package com.springcore.processor;

import com.springcore.data.Foo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * implements BeanDefinitionRegistryPostProcessor
 */
@Component
public class FooBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        // create definition bean
        GenericBeanDefinition definition = new GenericBeanDefinition();
        // set bean scope
        definition.setScope("singleton");
        // set bean class
        definition.setBeanClass(Foo.class);

        // register bean baru dengan tipe Foo.class dan scope singleton
        beanDefinitionRegistry.registerBeanDefinition("foo", definition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        // nothing
    }
}
