package com.example.docker_test.api.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/")
    public String hello() {
        return "hello11";
    }
}
