package org.khairul.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String root(){
        return "root (/)";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/getNumber")
    public Integer getNumber(){
        return 404;
    }

    @GetMapping("/getArray")
    public int[] getArr(){
        return new int[]{2,3,4};
    }
}
