package service;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    // add feature02
    @RequestMapping("/")
    String hello() {
        return "hello world";
    }
    // feature01 add
}
