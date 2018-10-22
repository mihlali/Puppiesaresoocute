package com.openshift.springboot.webapp.SpringStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@EnableAutoConfiguration
@SpringBootApplication
public class WebApplication extends SpringBootServletInitializer {

   public static void main(String[] args) {
      SpringApplication.run(WebApplication.class, args);
   }
   
   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
       return application.sources(WebApplication.class);
   }
}
