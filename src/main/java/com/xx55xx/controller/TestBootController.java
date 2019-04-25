package com.xx55xx.controller;

import com.xx55xx.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {
    @RequestMapping("getuser")
    public User getUser() {   //http://localhost:8080/testboot/getuser
        User user = new User();
        user.setUserName("小明");
        return user;
    }
}
