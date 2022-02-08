package com.springcore.listener;

import com.springcore.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * ini class otomatis akan mendengarkan event dari berbagai class yang diinginkan
 * cukup tambahkan annotation @EventListener
 * keuntungan menggunakan annotation yakni di satu class ini bisa membuat listener nya lebih dari satu
 * daripada kita membuat satu class yang hanya implement satu listener saja
 */
@Component
@Slf4j
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event) {
        log.info("Success login again for user {}", event.getUser());
    }
}
