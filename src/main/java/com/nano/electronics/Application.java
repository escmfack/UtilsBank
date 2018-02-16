package com.nano.electronics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableAutoConfiguration
public class Application {



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
