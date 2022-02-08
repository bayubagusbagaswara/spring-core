package com.springcore.data;

import com.springcore.aware.IdAware;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class Car implements IdAware {

    @Getter
    private String id;

    // id akan diset oleh IdGeneratorBeanPostProcessor
    @Override
    public void setId(String id) {
        this.id = id;
    }
}
