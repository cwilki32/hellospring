package com.detroitlabs.hellospring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class AppConfiguration {
    //can type psvm to generate main method()
    public static void main(String[] args) {
        SpringApplication.run(AppConfiguration.class, args);
    }
}
