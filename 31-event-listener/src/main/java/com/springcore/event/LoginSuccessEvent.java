package com.springcore.event;

import com.springcore.data.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * ini class Event
 * data event ini berisi data user yang sukses melakukan login
 */
public class LoginSuccessEvent extends ApplicationEvent {

    @Getter
    private final User user;

    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }
}
