package com.javatechie.springbootjenkins;

import com.javatechie.springbootjenkins.controller.SpringJenkinsController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootJenkinsApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(SpringbootJenkinsApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case executing...in SpringbootJenkinsApplicationTests Class");
        assertEquals(true, true);
    }

}
