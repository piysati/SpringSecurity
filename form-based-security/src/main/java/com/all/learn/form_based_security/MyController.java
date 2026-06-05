package com.all.learn.form_based_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *     http://localhost:8080/hello
 * */
@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/hey")
    public String hey(){
        return "Hey World";
    }

    @GetMapping("/hi")
    public String hi(){
        return "Hi World";
    }

}
