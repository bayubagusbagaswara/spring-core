package com.springcore.processor;

import com.springcore.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor {

    // semua bean yang masuk ke container spring akan melaui pengecekan bean post processor ini
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Id Generator Processor for Bean {}", beanName);

        // cek jika bean nya itu turunan dari IdAware
        if (bean instanceof IdAware) {
            log.info("Set Id Generator for Bean {}", beanName);
            // konvesi menjadi IdAware
            IdAware idAware = (IdAware) bean;

            // set id menjadi UUID
            idAware.setId(UUID.randomUUID().toString());
        }
        return bean;
    }
}
