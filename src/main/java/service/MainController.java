package service;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/")
    String hello() {
        return "hello world";
    }
    // feature01 add
    // add feature02
}
