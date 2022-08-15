package com.epam.jeka.autocomletedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(DbProps.class)
public class AutoComleteDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoComleteDemoApplication.class, args);
    }

}
