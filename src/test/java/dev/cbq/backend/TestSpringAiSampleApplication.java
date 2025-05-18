package dev.cbq.backend;

import org.springframework.boot.SpringApplication;

public class TestSpringAiSampleApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringAiSampleApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
