package com.sparta.week03hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Week03hwApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week03hwApplication.class, args);
    }

}
