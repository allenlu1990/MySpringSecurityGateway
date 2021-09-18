package org.example.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 * Created by macro on 2020/6/19.
 */
@RestController
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello")
    public String hello() {
        logger.info("say hello！！！！！");
        return "Hello World.";
    }

}
