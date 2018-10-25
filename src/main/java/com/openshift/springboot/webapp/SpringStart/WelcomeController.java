package com.openshift.springboot.webapp.SpringStart;

import org.springframework.web.bind.annotation.RequestMapping;



public class WelcomeController {

    @RequestMapping("/")
    public String welcome() {

        return "welcome";
    }
}
