package dev.cbq.backend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@Slf4j
@SpringBootApplication
public class SpringAiSampleApplication {

    public static void main(String[] args) {
//        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(SpringAiSampleApplication.class, args);
    }


    @EventListener
    public void onApplicationReadyEvent(ApplicationReadyEvent event) {
        log.info("SpringAiSampleApplication.onApplicationReadyEvent {}", event.getApplicationContext());
    }
}
