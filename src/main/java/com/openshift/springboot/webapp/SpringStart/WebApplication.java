package com.openshift.springboot.webapp.SpringStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class WebApplication extends WebMvcConfigurerAdapter {

   public static void main(String[] args) {
      SpringApplication.run(WebApplication.class, args);
   }
}
