package com.springcore.service;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class AuthService implements ApplicationContextAware, BeanNameAware {

    // untuk menyimpan nama bean
    @Getter
    private String beanName;

    // untuk menyimpan application context
    @Getter
    private ApplicationContext applicationContext;

    // bean dari AuthService ini membutuhkan nama bean nya, jadi Spring akan otomatis me-set nya
    @Override
    public void setBeanName(String name) {
        // set beanName dengan name
        this.beanName = name;
    }

    // secara otomatis Spring akan menginject ApplicationContext ke sini
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
