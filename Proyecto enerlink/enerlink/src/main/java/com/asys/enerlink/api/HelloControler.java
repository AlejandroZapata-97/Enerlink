package com.asys.enerlink.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @GetMapping
    public String hello() {
        return "hola mundo";
    }
}
