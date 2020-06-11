package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloControllers {
    @GetMapping("/hello")
    public String hello(){

        return "hello";
    }
}
