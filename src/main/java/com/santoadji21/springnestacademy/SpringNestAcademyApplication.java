package com.santoadji21.springnestacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class SpringNestAcademyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringNestAcademyApplication.class, args);
    }

}
