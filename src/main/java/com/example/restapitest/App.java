package com.example.restapitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class App {

    private static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        String logMsg = String.format("hello - name[%s]", name)
        logger.info(logMsg);
        return String.format("Hello %s!", name);
    }

    @GetMapping("/bye")
    public String bye(@RequestParam(value = "name", defaultValue = "World") String name) {
        String logMsg = String.format("bye - name[%s]", name);
        logger.info(logMsg);
        return String.format("Bye %s", name);
    }

}
