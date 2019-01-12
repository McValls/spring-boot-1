package com.mcvalls.logger.utils.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/helloWorld")
    public String index() {
        return "Docker HELLO WORLD with Spring Boot!!";
    }

}
