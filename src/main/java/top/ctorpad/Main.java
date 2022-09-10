package top.ctorpad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Main {

    @RequestMapping("/")
    String home() {
        return "Hello World 4!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}