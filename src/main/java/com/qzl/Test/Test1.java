package com.qzl.Test;

import com.qzl.Dome.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.qzl")
@EnableConfigurationProperties(User.class)
public class Test1 {

   @Autowired
   User user;

   @RequestMapping("/")
    User user(){
       log.info("进入了s");
       return user; }

    @RequestMapping("/hello")
    String home(){ return "你好呀世界"; }

    public static void main(String[] args) {
        SpringApplication.run(Test1.class,args);
    }
}
