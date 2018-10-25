package com.openshift.springboot.webapp.SpringStart;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome() {

        return "welcome";
    }
}
