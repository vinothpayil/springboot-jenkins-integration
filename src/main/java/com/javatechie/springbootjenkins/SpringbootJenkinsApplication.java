package com.javatechie.springbootjenkins;

import com.javatechie.springbootjenkins.controller.SpringJenkinsController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringJenkinsController.class);

    public static void main(String[] args) {
        logger.info("Spring Boot Application Started in Main Method of SpringbootJenkinsApplication Class");
        SpringApplication.run(SpringbootJenkinsApplication.class, args);
    }

}
