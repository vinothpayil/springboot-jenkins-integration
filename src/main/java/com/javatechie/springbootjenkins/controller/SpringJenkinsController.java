package com.javatechie.springbootjenkins.controller;





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot-jenkins")
public class SpringJenkinsController {

    // Implement log4j2 logging here
    private static final Logger logger = LoggerFactory.getLogger(SpringJenkinsController.class);


    @GetMapping("/welcome")
    public String welcome() {
        logger.info("Welcome to Spring Jenkins Integration Example - INFO Log Message from SpringJenkinsController Class");
        return "Welcome to Spring Jenkins Integration Example";
    }
}
