package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by joe 
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello Ahmet";
    }

}
