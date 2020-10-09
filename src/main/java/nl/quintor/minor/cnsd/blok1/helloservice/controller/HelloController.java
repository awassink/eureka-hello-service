package nl.quintor.minor.cnsd.blok1.helloservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String home() {
        return "Hello world!";
    }
}
