package com.springcore.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * ApplicationStartingEvent dikirim ketika start aplikasi, sebelum application context dibuat
 * ini dieksekusi sebelum bean nya dibuat
 */
@Slf4j
public class AppStartingListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        log.info("Application starting");
    }
}
