package com.springcore.service;

import com.springcore.data.User;
import com.springcore.event.LoginSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {

    // butuh ApplicationEventPublisher
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String username, String password) {
        if (isLoginSuccess(username, password)) {
            // jika sukses login
            // kita kirim event ke semua listener, bahwa ada user yang sukses login
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return true;
        } else {
            // jika gagal login
            return false;
        }
    }

    // misal data username dan password nya harus sesuai
    private boolean isLoginSuccess(String username, String password) {
        return "bayu".equals(username) && "rahasia".equals(password);
    }
}
