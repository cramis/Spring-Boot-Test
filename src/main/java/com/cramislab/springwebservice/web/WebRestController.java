package com.cramislab.springwebservice.web;


import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class WebRestController {

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld!!";
    }
}
